package brm.editor.database.common;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 * @author Gregory
 */
public final class CommonGender {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
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

  @FXML
  private void initialize() {
    sexF.setToggleGroup(toggleGroup);
    sexM.setToggleGroup(toggleGroup);
    sexN.setToggleGroup(toggleGroup);
    toggleGroup.selectToggle(sexF);
  }
}
