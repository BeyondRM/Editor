package brm.editor.project.utility;
import java.io.File;


/**
 * A Document Object Model for reading a sample XML file object.
 * <p/>
 * This is actually the "parent" class for handling the XML files in the A3FXML files database. Use this as the
 * super-type for defining XML-loading handlers.
 * @author Gregory
 */
abstract public class AEditorProjectDataXML extends AEditorProject {
  /**
   * A public constructor. This is used to instantiate a new {@link ADataFileXML} object. This one allows providing the
   * base directory and the base file name; it passes execution to the second form.
   * <p/>
   * Subclasses must pass {@code false} to the {@code b} parameter; it is only used for example. The {@code f} parameter
   * is the base path, and the {@code s} parameter is the filename reference to your XML file to read into the class.
   * <p/>
   * This class assigns class fields {@link #xmldoc xmldoc}, {@link #builder builder}, {@link #document document}, and
   * {@link #rootnodeName rootnodeName} to their usable values.
   * @param f A {@link File} object, representing the root directory to start.
   * @param s A {@link String} object, representing the actual XML file name.
   * @param b A {@link Boolean} condition, representing whether to parse nodes.
   */
  public AEditorProjectDataXML(File f, String s, boolean b) {
    this(new File(f, s), b);
  }

  /**
   * A public constructor. This is used to instantiate a new {@link ADataFileXML} object. This one allows providing the
   * full file name; it requires that the file reference is to the actual XML file.
   * <p/>
   * Subclasses must pass {@code false} to the {@code b} parameter; it is only used for example. The {@code f} parameter
   * is the full file reference to your XML file to be read into the class.<p/>
   * This class assigns class fields {@link #xmldoc xmldoc}, {@link #builder builder}, {@link #document document}, and
   * {@link #rootnodeName rootnodeName}.
   * @param f A {@link File} object, representing the actual XML file.
   * @param b A {@link Boolean} condition, representing whether to parse nodes.
   */
  public AEditorProjectDataXML(File f, boolean b) {
    super(f, "");
  }
}
