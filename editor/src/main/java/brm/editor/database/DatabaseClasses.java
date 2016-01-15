package brm.editor.database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class DatabaseClasses implements Initializable {
  @FXML
  private ListView<String> lvClasses;
  @FXML
  private TextField tfName;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }
}
