package brm.editor.mapping.mapper;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


/**
 * The mapper tile selector.
 * <p>
 * This is a canvas to select the individual tile from an active tile sheet. The canvas holds the 32x32 pixel tiles, in
 * a 256-pixel-wide by 1024-pixel-long canvas.
 * @author Gregory
 */
public class MapperTileSelector {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields

  public MapperTileSelector() {
  }

  @FXML
  private void initialize() {
  }
}
