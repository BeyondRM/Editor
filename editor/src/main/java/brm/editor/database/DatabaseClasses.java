package brm.editor.database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public final class DatabaseClasses {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  @FXML
  private ListView<String> lvClasses;
  @FXML
  private TextField tfName;

  public DatabaseClasses() {
  }

  @FXML
  private void initialize() {
  }
}
