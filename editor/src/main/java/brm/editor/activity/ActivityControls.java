package brm.editor.activity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;


/**
 * @author Gregory
 */
public class ActivityControls implements Initializable {
  @FXML
  protected Pane pane1;
  @FXML
  protected Pane pane2;
  @FXML
  protected Pane pane3;

  @FXML
  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

  @FXML
  public void clickComponent(ActionEvent ae) {
    // handle events per component:
    if(ae.getSource() == pane1) {
    }
  }
}
