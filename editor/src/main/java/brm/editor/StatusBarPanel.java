package brm.editor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public final class StatusBarPanel extends HBox {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  @FXML
  protected TextField textField1;
  @FXML
  protected TextField textField2;
  @FXML
  protected TextField textField3;

  public StatusBarPanel() {
  }

  @FXML
  private void initialize() {
    textField1 = new TextField();
    textField2 = new TextField();
    textField3 = new TextField();
  }

  public String getTextField(int i) {
    switch(i) {
      case 0:
        return textField1.getText();
      case 1:
        return textField2.getText();
      case 2:
      default:
        return textField3.getText();
    }
  }

  public void setTextField(int i, String s) {
    switch(i) {
      case 0:
        textField1.setText(s);
        break;
      case 1:
        textField2.setText(s);
        break;
      case 2:
      default:
        textField3.setText(s);
        break;
    }
  }
}
