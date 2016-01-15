package test;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;


/**
 * @author ROBT
 */
public class TestButton extends AnchorPane {
  @FXML
  private AnchorPane myTestButton;

  public TestButton() {
    URL url = getClass().getResource("/com/lynden/planning/ui/TestButton.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(url);
    fxmlLoader.setRoot(TestButton.this);
    fxmlLoader.setController(TestButton.this);
    try {
      fxmlLoader.load();
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }
}
