package brm.project.xport.orm.tempdata;
import brm.editor.project.utility.AEditorProject;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author Gregory
 */
public class OrmXmlVehicles extends AEditorProject {
  public String name;      // the vehicle name
  public int sprite;       // the associated character sprite to use
  public int passingPhase; // the passing phase, for passability
  public int landingPhase; // the landing phase, for passability
  public boolean flying;   // whether this vehicle flies / avoids ground obstacles
  //BackGround Music:
  public String location;  // the location of the music file
  public boolean retainPitch;// whether to retain the pitch in the music file
  public double volume;    // the volume
  public double panning;   // the panning offset
  public double speed;     // the playback speed
  public double fadeInTime;// the fade-in time

  public OrmXmlVehicles(File f) throws ParserConfigurationException, SAXException, IOException {
    super(f, "");
    name = attributes.getNamedItem("name").getNodeValue();
    sprite = Integer.getInteger(attributes.getNamedItem("sprite").getNodeValue());
    passingPhase = Integer.getInteger(attributes.getNamedItem("passingPhase").getNodeValue());
    landingPhase = Integer.getInteger(attributes.getNamedItem("landingPhase").getNodeValue());
    flying = Boolean.getBoolean(attributes.getNamedItem("flying").getNodeValue());

    nodeList = rootnodeNode.getChildNodes();
    if(nodeList.item(0).getNodeName().equals("bgm")) {
      attributes = nodeList.item(0).getAttributes();
      location = attributes.getNamedItem("location").getNodeValue();
    }
  }

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
