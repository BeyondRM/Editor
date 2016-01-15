package brm.editor.project.data;
import brm.editor.project.EditorProject;
import brm.editor.project.utility.AEditorProject;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 * <h2>BrmProject</h2>
 * An editor project instance.
 * A public utility class with fields and methods to manage the properties of an Alternative RPG Maker project metadata.
 * @author Gregory
 */
public class BrmProject extends AEditorProject {
  // attributes in the root node:
  private String authors;
  private String name;
  private String version;
  // attributes in the child node "editor-versioning":
  private String repoPath; // the URL to the destination to the storage (in the case of versioning, it's the repository)
  private String repoType; // could be something like Subversion or Git, or even upload to Dropbox or something....
  // attributes in the child node "engine-target-options":
  private boolean displayTitle;
  private boolean fullscreen;
  // attributes in the child node "engine-target-resolutions":
  private String resolutionDefault;
  private String resolutionMaximum;
  private String resolutionMinimum;

  /**
   * A public constructor. This instantiates a new {@link AltRpgMakerProject} object with a project file.
   * @param f A {@link File} object, representing the XML object to parse.
   * @throws javax.xml.parsers.ParserConfigurationException
   * @throws org.xml.sax.SAXException
   * @throws java.io.IOException
   */
  public BrmProject(File f) throws ParserConfigurationException, SAXException, IOException {
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

  /**
   * A public getter method to obtain the authors list.<p/>
   * In the editor, this is shown as a literal list component, each author on a separate line; in terms of the XML file,
   * the list is put together into one text, with a '|' (vertical-pipe character) so that it can be parsed here.
   * @return A {@link String} object.
   */
  public String getAuthors() {
    return authors;
  }

  /**
   * A public getter method to obtain
   * @return A {@link String} object.
   */
  public String getName() {
    return name;
  }

  /**
   * A public getter method to obtain
   * @return A {@link String} object.
   */
  public String getRepoPath() {
    return repoPath;
  }

  /**
   * A public getter method to obtain
   * @return A {@link String} object.
   */
  public String getRepoType() {
    return repoType;
  }

  /**
   * A public getter method to obtain the default resolution allowed by the game developer.<p/>
   * Default resolution is the resolution the resulting game will attempt to initialize; if the user's maximum display
   * resolution is smaller than this, the whole screen may be used, otherwise this value is used.
   * @return A {@link String} object.
   */
  public String getResolutionDefault() {
    return resolutionDefault;
  }

  /**
   * A public getter method to obtain the maximum resolution allowed by the game developer.<p/>
   * Some project art &mdash; title screens and certain background images &mdash; are best viewed at the resolution they
   * were designed to be shown. The developer can use this to specify that the game not run at a larger resolution than
   * what is designed.
   * @return A {@link String} object.
   */
  public String getResolutionMaximum() {
    return resolutionMaximum;
  }

  /**
   * A public getter method to obtain the minimum resolution allowed by the game developer.<p/>
   * Most games are best viewed when all the on-screen components have space to be displayed; this affects the minimum
   * required resolution, and this
   * @return A {@link String} object.
   */
  public String getResolutionMinimum() {
    return resolutionMinimum;
  }

  /**
   * A public getter method to obtain the project data version &mdash; not the release version, but which version of the
   * data format is being used. This promotes the capability to keep the project "upgradable" and "future-proof".
   * @return A {@link String} object.
   */
  public String getVersion() {
    return version;
  }

  /**
   * A public getter method to obtain the project's display title, useful for the editor's title-bar display name.
   * @return A {@link Boolean} condition.
   */
  public boolean isDisplayTitle() {
    return displayTitle;
  }

  /**
   * A public getter method to obtain whether the game will run full-screened, when testing and development.
   * This should not affect when the game is distributed; each player can set their own preferences.
   * But also, for projects where sharing the development process, this is not a per-user configuration &mdash; yet.
   * @return A {@link Boolean} condition.
   */
  public boolean isFullscreen() {
    return fullscreen;
  }

  /**
   * A public setter method to set the authors tag.
   * @param s
   */
  public void setAuthors(String s) {
    if(EditorProject.instance.isLoaded()) {
      this.projectDataChanged = true;
    }
    this.authors = s;
  }

  /**
   * A public setter method to set the project's display title.
   * @param b
   */
  public void setDisplayTitle(boolean b) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.displayTitle = b;
  }

  /**
   * A public setter method to set whether the game should play full-screen by default while testing.
   * @param b
   */
  public void setFullscreen(boolean b) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.fullscreen = b;
  }

  /**
   * A public setter method to set the project name.
   * @param s
   */
  public void setName(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.name = s;
  }

  /**
   * A public setter method to set the repository path.
   * @param s
   */
  public void setRepoPath(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.repoPath = s;
  }

  /**
   * A public setter method to set the repository type.
   * @param s
   */
  public void setRepoType(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.repoType = s;
  }

  /**
   * A public setter method to set the default resolution for the game.
   * @param s
   */
  public void setResolutionDefault(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.resolutionDefault = s;
  }

  /**
   * A public setter method to set the maximum resolution for the game.
   * @param s
   */
  public void setResolutionMaximum(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.resolutionMaximum = s;
  }

  /**
   * A public setter method to set the minimum resolution for the game.
   * @param s
   */
  public void setResolutionMinimum(String s) {
    if(EditorProject.instance.isLoaded()) {
      projectDataChanged = true;
    }
    this.resolutionMinimum = s;
  }

  /**
   * Set the project version.
   * @param s A {@link String} object, representing the
   */
  public void setVersion(String s) {
    if(!version.equals(s)) {
      version = s;
      projectDataChanged = true;
      EditorProject.instance.setChanged(true);
    }
  }
}
