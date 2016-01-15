package brm.editor.system.timing;
import brm.editor.project.data.system.SystemTimingMonths;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class TimingMonths implements Initializable {
  @FXML
  private PropertyValueFactory<SystemTimingMonths, Integer> number;
  @FXML
  private PropertyValueFactory<SystemTimingMonths, String> abbreviation;
  @FXML
  private PropertyValueFactory<SystemTimingMonths, String> name;
  @FXML
  private PropertyValueFactory<SystemTimingMonths, Integer> days;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }
}
