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
public class SystemXml extends AEditorProject implements IConvertMarkupInput, IConvertMarkupOutput {
  public String title; // the title screen background URL
  public String gameover; // the game-over screen background URL
  public int mainMenuID; // the ordinal id of the menu instance
  //startLocations:
  //		<party mapID="0" x="9" y="5" layer="0"/>    // the map id, the x/y coordinates, and active layer.
  //		<vehicle mapID="-1" x="0" y="0" layer="0"/> // the map id, the x/y coordinates, and active layer.
  //systemGraphics:
  public String frameBGLocation;
  public String frameBorderLocation;
  public String selectionBorderLocation;
  public String equipmentIndicatorsLocation;
  public String menuBGLocation;
  public String scrollArrowsLocation;
  public String grappleArmLocation;
  public String grappleHookLocation;
  public String timerNumbersLocation;
  public String fontShadowLocation;
  public String defaultColor;
  public String fontShadowColor;
  public String defaultFontEnabledColor;
  public String defaultFontDisabledColor;
  public boolean stretchToFit;
  //strings:
  //  ... a listing of game strings...
  //randommapgenerators:
  //  ... complex data for generating buildings, caverns, dungeons, mazes, mountains, towns, worlds....
  //variables:
  //  ... strings, numbers, switches....
  //battlecommands:
  //  ...
  //skillSubsets:
  //  ...
  //screentransitions:
  public int teleportErase;
  public int teleportShow;
  public int menuErase;
  public int menuShow;
  public int battleEntryErase;
  public int battleEntryShow;
  public int battleExitErase;
  public int battleExitShow;
  public int first;
  public int second;
  public int third;
  public int fourth; // each field starts out as -1 unless set to a character...
  //phases:
  //  ... a listing of each defined phase (defaults to 24, the first 9 are specifically named)

  //phases:
  //  ... a listing of each defined phase (defaults to 24, the first 9 are specifically named)
  public SystemXml(File f) throws ParserConfigurationException, SAXException, IOException {
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
