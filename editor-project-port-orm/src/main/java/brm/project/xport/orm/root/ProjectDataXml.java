package brm.project.xport.orm.root;
import brm.editor.project.utility.AEditorProject;
import brm.editor.project.utility.IConvertMarkupInput;
import brm.editor.project.utility.IConvertMarkupOutput;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author Gregory
 */
public class ProjectDataXml extends AEditorProject implements IConvertMarkupInput, IConvertMarkupOutput {
  public int fileFormatVersion;
  public String name; // <-- the project's name
  public boolean fullscreen = false;
  public boolean displaytitle = true;
  // editor:
  public String tool;
  public String editMode;
  public String zoom; // map view scaling - 1:1, 1:2, 1:4, 1:8
  public String tileset;
  // maplist:
  public int selectedmap;

  //  ... all maps in the hierarchy have the following attributes: int id, String name, boolean expanded
  public ProjectDataXml(File f) throws ParserConfigurationException, SAXException, IOException {
    super(f, "");
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
