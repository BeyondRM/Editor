package brm.editor.database.common;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class CommonGender implements Initializable {
  @FXML
  private VBox vBox;
  @FXML
  private RadioButton sexF;
  @FXML
  private RadioButton sexM;
  @FXML
  private RadioButton sexN;
  @FXML
  private ToggleGroup toggleGroup;
  // the public fields:
  public boolean changed = false;
  public char sex = 'f';

  public CommonGender() {
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    toggleGroup.selectToggle(sexF);
  }
}
