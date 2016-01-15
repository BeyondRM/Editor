package brm.editor.activity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * @author Gregory
 */
public class ActivityProjectData implements Initializable {
  /**
   * A button to rename a project.
   * <p/>
   * This component's enabled state should depend upon whether a project is open in the editor; if so, the button will
   * be enabled, and if not, it is disabled. &mdash; This completely depends upon the development of the EditorProject module
   * hierarchy, so that loading and unloading of a project can be done.
   */
  @FXML
  protected Button button1;
  /**
   * A button to handle miscellaneous project tasks.
   */
  @FXML
  protected Button button2;
  /**
   * The project name header.
   */
  @FXML
  protected Label label1;
  /**
   * The project name texts.
   */
  @FXML
  protected Label label2;

  @FXML
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    label1 = new Label(rb.getString("projectdata.label1"));
    button1 = new Button(rb.getString("projectdata.button1.text"));
    // button1 enabled state should depend upon whether a project is actually open, ... which requires developing the
    // project module(s) for handlling project data.
  }

  /**
   * Click on a component.
   * @param ae An {@link ActionEvent} object, representing the actionable event.
   */
  @FXML
  public void clickComponent(ActionEvent ae) {
  }
}
