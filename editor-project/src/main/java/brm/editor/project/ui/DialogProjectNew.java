package brm.editor.project.ui;
import brm.editor.project.data.ProjectData;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class DialogProjectNew implements Initializable {
  @FXML
  private Button buttonAccept;// the button used to open the file-selector to get an existing file directory.
  @FXML
  private Button buttonCancel;// the button used to open the file-selector to get an existing file directory.
  @FXML
  private Button buttonHelp;// the button used to open the file-selector to get an existing file directory.
  @FXML
  private Button buttonProjPath;// the button used to open the file-selector to get an existing file directory.
  @FXML
  private Label labelStatus;    // the dialog's status, as to whether we can proceed to create.
  @FXML
  private TextField tfGameName; // the "common" project title.
  @FXML
  private TextField tfGamePath; // the game's project folder name.
  @FXML
  private TextField tfProjPath; // the game's parent folder name.

  private final ProjectData projectData = ProjectData.instance;
  /**
   * The local representation of the root project path.
   */
  private File projPath;
  /**
   * A name for the game project, more representative of the project than the {@link #gamePath game path} often will be.
   */
  private String gameName;
  /**
   * A name for the game project, which will be the project directory name.
   * This is often an abbreviated form of the game title, and generally only a few words long.
   */
  private String gamePath;
  /**
   * A boolean condition representing if the user has changed the game project name to be different from the game path.
   * This prevents the obviously undesired instance of losing an altered game name.<p/>
   * Generally, the user will follow the flow of the dialog: first, selecting the root path (if so desired); and second,
   * typing the project path &mdash; which should also set the {@link #gameName game name} to be the same. However, if
   * the user goes to the third text field and specifies a longer or more accurate game title, and then goes back to the
   * {@link #tfGamePath game path} text field, this more accurate game name would be lost.<p/>
   * Thus, the reason for this field; it is {@code false} by default, and only set to {@code true} if the actual
   * {@link #gameName game name} is altered. Should the user desire to change the {@link #tfGamePath game path} again,
   * at least the set {@link #tfGameName game name} would not be altered.
   */
  private boolean nameChange = false;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

  @FXML
  private void onChangeGameName() {
    gameName = tfGameName.getText();
    if(nameChange) {
      nameChange = true;
    }
  }

  @FXML
  private void onChangeGamePath() {
    gamePath = tfGamePath.getText();
  }

  @FXML
  private void onClickAccept() {
    //TODO: Create the methodology for when the 'Accept' button is clicked.
    // This can either be simple, or complex. In a simple usage, this passes parameters to a method in a singled class
    // that manages the project data; in a complex usage, this method actually creates every project file from here.
    projectData.createProject(projPath, gamePath, gameName);
  }

  @FXML
  private void onClickCancel() {
    //TODO: Create the methodology for when the 'Cancel' button is clicked.
    // This is primarily for if anything should happen before closing the dialog; generally, nothing needs to be done,
    // other than calling the method to close this dialog.
  }

  @FXML
  private void onClickHelp() {
    //TODO: Create the methodology for when the 'Help' button is clicked.
    // This should launch a web browser that is navigated to the help page of choice.
  }

  @FXML
  private void onClickPath() {
    //TODO: Create the methodology for when the 'Project Path' button is clicked.
    // This should launch a dialog to select the root folder.
  }

  private String getStatus() {
    return "";
  }

  private boolean isValid() {
    return !tfGameName.getText().isEmpty()
        && !tfGamePath.getText().isEmpty()
        && !tfProjPath.getText().isEmpty();
  }

  private void setLabelStatus() {
    if(!isValid()) {
      // first, if the project path is null, then we cannot create a project anyway.
      // second, if the game name AND game path are null, we are trying to create a project with no name -- a bad idea.
      // third, if either the game name OR game path are empty strings, we can create a project, substituting for the other field.
    }
  }

  public void setStageAndSetupListeners(Stage stage) {
  }
}
