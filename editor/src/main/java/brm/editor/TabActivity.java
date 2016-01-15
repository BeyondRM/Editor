package brm.editor;
import brm.editor.activity.ActivityControls;
import brm.editor.activity.ActivityHelpHints;
import brm.editor.activity.ActivityProjectData;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 * @author Gregory
 */
public class TabActivity implements Initializable {
  @FXML
  protected ActivityControls controls;
  @FXML
  protected ActivityHelpHints hints;
  @FXML
  protected ActivityProjectData project;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    controls = new ActivityControls();
    hints = new ActivityHelpHints();
    project = new ActivityProjectData();
    project.initialize(null, null);
  }
}
