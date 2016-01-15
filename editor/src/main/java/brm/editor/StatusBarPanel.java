package brm.editor;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class StatusBarPanel extends HBox {
  @FXML
  protected TextField textField1;
  @FXML
  protected TextField textField2;
  @FXML
  protected TextField textField3;

  public StatusBarPanel() {
  }

  @FXML
  public void initialize() {
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
