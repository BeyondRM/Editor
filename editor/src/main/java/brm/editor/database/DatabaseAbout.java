package brm.editor.database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


/**
 * About the database. This class is for detailing how many of each database object type are in the current project and
 * possibly other statistic information. Possible objects that need to be examined:
 * <pre>
 *    Audio Resources
 *      Background Music
 *      Music Effects
 *      Sound Effects (Ambient, Battle, Other)
 *    Graphical Resources (Images)
 *      Animations
 *      Battlers, Battle Sprites
 *      .
 *      Tile Sets
 *      System Images
 *        Core Window Skin
 *        Icon Sets
 *        .
 *      .
 *    Object Definitions:
 *      Animations
 *      Attributes
 *      Characters
 *      Classes
 *      Conditions
 *      Events (Common, Character, Item, Map Events, etc.)
 *      Items
 *      Monsters/Opponents
 *      Monster Groups/Encounters
 *      Skills
 *      Variables
 *      Vehicles
 * </pre>
 * @author Gregory
 */
public final class DatabaseAbout {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  //TODO: Add either a text area or several text fields, to write the details of the database objects.

  public DatabaseAbout() {
  }

  @FXML
  private void initialize() {
  }
}
