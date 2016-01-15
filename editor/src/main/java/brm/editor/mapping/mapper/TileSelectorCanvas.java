package brm.editor.mapping.mapper;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;


/**
 * @author Gregory
 */
public class TileSelectorCanvas implements Initializable {
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

  @Override
  public void initialize(URL url, ResourceBundle rb) {
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
