package brm.editor.activity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;


/**
 * @author Gregory
 */
public final class ActivityControls {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  @FXML
  protected Pane pane1;
  @FXML
  protected Pane pane2;
  @FXML
  protected Pane pane3;

  public ActivityControls() {
  }

  @FXML
  private void initialize() {
  }

  @FXML
  public void clickComponent(ActionEvent ae) {
    // handle events per component:
    if(ae.getSource() == pane1) {
    }
  }
}
