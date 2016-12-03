package brm.editor.mapping.mapper;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;


/**
 * @author Gregory
 */
public final class TileSelectorCanvas {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  @FXML
  private Canvas canvas;
  @FXML
  private Label label1;
  @FXML
  private Label label2;
  @FXML
  private ComboBox<String> combo1;
  @FXML
  private ComboBox<String> combo2;
  @FXML
  private ScrollPane scrollPane;

  public TileSelectorCanvas() {
  }

  @FXML
  private void initialize() {
  }

  @FXML
  public void onCanvasMouseClicked(ActionEvent me) {
  }

  @FXML
  public void onChangeTileset(ActionEvent ae) {
  }

  @FXML
  public void onChangeTilesheet(ActionEvent ae) {
  }
}
