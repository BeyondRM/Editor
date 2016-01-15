package brm.editor.database.items;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author Gregory
 */
public class TemplateItemSubtypeListController implements Initializable {
  @FXML
  private AnchorPane anchorPane;
  @FXML
  private Button button;
  @FXML
  private HBox hBox;
  @FXML
  private Label label;
  @FXML
  private TableColumn<TemplateSubtypes, Integer> column1;
  @FXML
  private TableColumn<TemplateSubtypes, String> column2;
  @FXML
  private TableColumn<TemplateSubtypes, String> column3;
  @FXML
  private TableView<TemplateSubtypes> tableView;
  @FXML
  private TextField textFieldAbbr;
  @FXML
  private TextField textFieldName;
  @FXML
  private VBox vBox;
  // non-fxml:
  private List<String> strings;
  private String baseAbbr;
  private String baseName;
  private boolean changed;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

  @FXML
  public void modifyTextFieldAbbr() {
  }

  @FXML
  public void modifyTextFieldName() {
  }

  @FXML
  public void saveChange() {
    ObservableList<TemplateSubtypes> items = tableView.getItems();
    int index = tableView.getSelectionModel().getSelectedIndex();
    if(!items.get(index).abbr.equals(textFieldAbbr.getText())) {
      items.get(index).abbr.set(textFieldAbbr.getText());
    }
    if(!items.get(index).name.equals(textFieldName.getText())) {
      items.get(index).name.set(textFieldName.getText());
    }
  }

  public void setLabel(String s) {
    label.setText(s);
  }
}
