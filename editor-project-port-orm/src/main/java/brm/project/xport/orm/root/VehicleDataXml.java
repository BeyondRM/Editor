package brm.project.xport.orm.root;
import brm.editor.project.utility.AEditorProject;
import brm.editor.project.utility.IConvertMarkupInput;
import brm.editor.project.utility.IConvertMarkupOutput;
import brm.project.xport.orm.tempdata.OrmXmlVehicles;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


/**
 *
 * @author Gregory
 */
public class VehicleDataXml extends AEditorProject implements IConvertMarkupInput, IConvertMarkupOutput {
  private OrmXmlVehicles vehicles;
  private final String name;
  private final int sprite;
  private final int passingPhase;
  private final int landingPhase;
  private final boolean flying;
  //bgm:
  private String location;
  private int volume;
  private int panning;
  private int speed;
  private int fadeInTime;
  private boolean retainPitch;

  public VehicleDataXml(File file) throws ParserConfigurationException, SAXException, IOException {
    super(file, "");
    name = attributes.getNamedItem("name").getLocalName();
    sprite = Integer.getInteger(attributes.getNamedItem("sprite").getLocalName());
    passingPhase = Integer.getInteger(attributes.getNamedItem("passingPhase").getLocalName());
    landingPhase = Integer.getInteger(attributes.getNamedItem("landingPhase").getLocalName());
    flying = Boolean.getBoolean(attributes.getNamedItem("flying").getLocalName());
    // should have at least the one child node: "bgm" for background music when on the vehicle....
    if(nodeList.getLength() > 0) {
      for(int i = 0; i == nodeList.getLength() - 1; i++) {
        Node node = rootnodeNode.getChildNodes().item(i);
        attributes = node.getAttributes();
        location = attributes.getNamedItem("location").getLocalName();
        volume = Integer.getInteger(attributes.getNamedItem("volume").getLocalName());
        panning = Integer.getInteger(attributes.getNamedItem("panning").getLocalName());
        speed = Integer.getInteger(attributes.getNamedItem("speed").getLocalName());
        fadeInTime = Integer.getInteger(attributes.getNamedItem("fadeInTime").getLocalName());
        retainPitch = Boolean.getBoolean(attributes.getNamedItem("retainPitch").getLocalName());
      }
    }
  } // should have at least the one child node: "bgm" for background music when on the vehicle....

  @Override
  public boolean isProjectDataChanged() {
    return projectDataChanged;
  }

  @Override
  public boolean isProjectDataLoaded() {
    return projectDataLoaded;
  }

  @Override
  public boolean isProjectDataSaved() {
    return projectDataSaved;
  }

  @Override
  public boolean markupSourceExists() {
    return false;
  }

  @Override
  public boolean markupTargetExists() {
    return false;
  }

  @Override
  public void markupInputBefore() {
  }

  @Override
  public void markupInputDuring() {
  }

  @Override
  public void markupInputFinish() {
  }

  @Override
  public void markupOutputBefore() {
  }

  @Override
  public void markupOutputDuring() {
  }

  @Override
  public void markupOutputFinish() {
  }

  @Override
  public void onProjectDataBuild() {
  }

  @Override
  public void onProjectDataClose() {
  }

  @Override
  public void onProjectDataExport() {
  }

  @Override
  public void onProjectDataImport() {
  }

  @Override
  public void onProjectDataNew() {
  }

  @Override
  public void onProjectDataOpen() {
  }

  @Override
  public void onProjectDataSave() {
  }

  @Override
  public void onProjectDataSaveAs() {
  }

  @Override
  public void setProjectDataChanged(boolean b) {
    projectDataChanged = b;
  }

  @Override
  public void setProjectDataLoaded(boolean b) {
    projectDataLoaded = b;
  }

  @Override
  public void setProjectDataSaved(boolean b) {
    projectDataSaved = b;
  }
}
