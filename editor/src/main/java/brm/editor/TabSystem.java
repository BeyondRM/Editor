package brm.editor;
import brm.editor.system.SystemImages;
import brm.editor.system.SystemMedia;
import brm.editor.system.SystemScreens;
import brm.editor.system.SystemStrings;
import brm.editor.system.SystemTiming;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public final class TabSystem {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
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

  public TabSystem() {
  }

  @FXML
  private void initialize() {
  }
}
