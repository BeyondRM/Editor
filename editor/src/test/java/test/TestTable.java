package test;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;


/**
 * @author ROBT
 */
public class TestTable extends AnchorPane {
  @FXML
  private TableView<String> myTableView;

  public TestTable() {
    URL url = getClass().getResource("/com/lynden/planning/ui/TestTable.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(url);
    fxmlLoader.setRoot(TestTable.this);
    fxmlLoader.setController(TestTable.this);
    try {
      fxmlLoader.load();
    } catch(IOException exception) {
      throw new RuntimeException(exception);
    }
  }
}
