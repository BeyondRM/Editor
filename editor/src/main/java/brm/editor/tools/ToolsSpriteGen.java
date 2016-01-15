package brm.editor.tools;
import brm.editor.tools.spritery.TempCharImageEditor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


/**
 *
 * @author Gregory
 */
public class ToolsSpriteGen implements Initializable {
  private static final TempCharImageEditor tcie = TempCharImageEditor.instance;

  @FXML
  private Button buttonQuit;
  @FXML
  private Button buttonSave;
  @FXML
  private ChoiceBox<String> cbBaseType;
  @FXML
  private ChoiceBox<String> cbCharAged;
  @FXML
  private ImageView ivSprite;
  @FXML
  private Label summary;
  @FXML
  private ListView<String> listElements;
  @FXML
  private RadioButton sexF;
  @FXML
  private RadioButton sexM;
  @FXML
  private RadioButton sexN;
  @FXML
  private TextField tfTargetName;

  @FXML
  private void handleButtonAction(ActionEvent event) {
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    //TODO: Create the initialization methodology for pre-loading the defaults for combo-boxes and lists.
    // The base body types, the genders, the ages ....

    tfTargetName.setText(tcie.currentCharName);
  }
}
