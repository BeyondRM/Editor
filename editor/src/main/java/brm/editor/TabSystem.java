package brm.editor;
import brm.editor.system.SystemImages;
import brm.editor.system.SystemMedia;
import brm.editor.system.SystemScreens;
import brm.editor.system.SystemStrings;
import brm.editor.system.SystemTiming;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class TabSystem implements Initializable {
  @FXML
  private SystemImages images;
  @FXML
  private SystemMedia media;
  @FXML
  private SystemScreens screens;
  @FXML
  private SystemStrings strings;
  @FXML
  private SystemTiming timing;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }
}
