package brm.editor.project.utility;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * A platform markup definition. This abstract class defines fields and methods for initializing a markup-handling base
 * methodology. It is used in reading XML files for their content, and for beginning the parsing of child-nodes. Fields
 * will generally be instantiated in the constructor, via the following order:
 * <ol>
 * <li/>{@link #xmldoc xmldoc} &mdash; the file reference equating to where the XML document is located, physically.
 * <li/>{@link #builder builder} &mdash; the document builder object, which is used to "parse" the XML File object.
 * <li/>{@link #document document} &mdash; the resulting document object which has been parsed by Java and can also be
 * parsed by this class and its implementers.
 * <li/>{@link #rootnodeNode rootnodeNode} &mdash; the root document node, for beginning the implementation parsing.
 * <li/>{@link #rootnodeName rootnodeName} &mdash; the root node's name;
 * <li/>{@link #attributes attributes} &mdash; a list of attribute nodes in the root node of the XML document.
 * <li/>{@link #nodeList nodeList} &mdash; the list of child-nodes obtainable from the root document node.
 * </ol>
 * If things have worked correctly, none of the above should be null, or have empty values; the value of boolean field
 * {@link #loadedSafely loadedSafely} is the direct result of checking these things, at the end of the constructor.
 * @author Gregory
 */
abstract public class AMarkup {
  protected static final String FORMAT_ROOTNODE = "xml file root [%s]";
  // non-static fields
  /**
   * The XML file reference to use.
   * @see AMarkup
   */
  protected final File xmldoc;
  /**
   * Whether the document is loaded safely.
   * @see AMarkup
   */
  protected final boolean loadedSafely;
  /**
   * The document reference.
   * @see AMarkup
   */
  protected Document document;
  /**
   * The builder reference.
   * @see AMarkup
   */
  protected DocumentBuilder builder;
  /**
   * The attributes mapping.
   * <p/>
   * The element's attributes list in the document's root node, if any exist; null otherwise.
   * <p/>
   * This is set in the {@link #parseNodes(String) parseNodes(String)} method, so each implementing class must set this.
   * @see AMarkup
   */
  protected NamedNodeMap attributes;
  /**
   * The root node itself.
   * @see AMarkup
   */
  protected Node rootnodeNode;
  /**
   * The node list.
   * <p/>
   * These are all the child nodes of the document root node.
   * <p/>
   * This is set in the {@link #parseNodes(String) parseNodes(String)} method, so each implementing class must set this.
   * @see AMarkup
   */
  protected NodeList nodeList;
  /**
   * The root node name.
   * @see AMarkup
   */
  protected String rootnodeName;

  /**
   * A public constructor. This is used to instantiate the (XML) markup document, via the following code:
   * <pre>
   *     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
   *     builder = factory.newDocumentBuilder();
   *     document = builder.parse(xmldoc);
   *     document.normalize();
   *     rootnodeNode = document.getDocumentElement();
   *     rootnodeName = rootnodeNode.getNodeName();
   *     attributes = rootnodeNode.getAttributes();
   *     nodeList = rootnodeNode.getChildNodes();
   * </pre> and finally, if no exceptions were thrown:
   * <pre>
   *     loadedSafely = document != null && document.getDocumentElement() != null;
   * </pre>
   * @param f
   * @param s
   * @throws ParserConfigurationException cannot create builder from factory instance.
   * @throws SAXException                 the SAX engine cannot parse the document.
   * @throws IOException                  problem with file input-output or access.
   */
  public AMarkup(File f, String s) throws ParserConfigurationException, SAXException, IOException {
    xmldoc = f;
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    builder = factory.newDocumentBuilder();
    document = builder.parse(xmldoc);
    //The above is okay for external xml; but for included files, use:
//  document = builder.parse(AEditorProject.class.getResourceAsStream("relative/path/in/jar/YourXmlFile.xml"))
    document.normalize();
    rootnodeNode = document.getDocumentElement();
    rootnodeName = rootnodeNode.getNodeName();
    attributes = getAttributes(rootnodeNode);
    nodeList = getChildNodes();
    loadedSafely = document != null && document.getDocumentElement() != null;
  }

  /**
   * Get all attributes in a node.
   * @param node A {@link Node} object, representing a node to parse.
   * @return A {@link NamedNodeMap} object.
   * @see AMarkup
   */
  protected final NamedNodeMap getAttributes(Node node) {
    return node != null && node.hasAttributes()
        ? node.getAttributes()
        : null;
  }

  /**
   * Get any nodes within a node.
   * @return A {@link NodeList} object.
   * @see AMarkup
   */
  protected final NodeList getChildNodes() {
    return rootnodeNode.hasChildNodes()
        ? rootnodeNode.getChildNodes()
        : null;
  }
}
