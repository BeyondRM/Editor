package brm.editor;
import brm.editor.activity.ActivityControls;
import brm.editor.activity.ActivityHelpHints;
import brm.editor.activity.ActivityProjectData;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


/**
 * @author Gregory
 */
public final class TabActivity {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  @FXML
  protected ActivityControls controls;
  @FXML
  protected ActivityHelpHints hints;
  @FXML
  protected ActivityProjectData project;

  public TabActivity() {
  }

  @FXML
  private void initialize() {
    controls = new ActivityControls();
    hints = new ActivityHelpHints();
    project = new ActivityProjectData();
  }
}
