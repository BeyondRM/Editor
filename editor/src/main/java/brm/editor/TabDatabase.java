package brm.editor;
import brm.editor.database.DatabaseAbout;
import brm.editor.database.DatabaseAnimations;
import brm.editor.database.DatabaseAttributes;
import brm.editor.database.DatabaseCharacters;
import brm.editor.database.DatabaseClasses;
import brm.editor.database.DatabaseConditions;
import brm.editor.database.DatabaseEvents;
import brm.editor.database.DatabaseItems;
import brm.editor.database.DatabaseMonsters;
import brm.editor.database.DatabaseSkills;
import brm.editor.database.DatabaseVariables;
import brm.editor.database.DatabaseVehicles;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


/**
 * @author Gregory
 */
public final class TabDatabase {
  // special auto-injected values:
  @FXML
  private URL location;
  @FXML
  private ResourceBundle resources;
  // Other FXML components/fields
  protected DatabaseAbout about;
  protected DatabaseAnimations animations;
  protected DatabaseAttributes attributes;
  protected DatabaseCharacters characters;
  protected DatabaseClasses classes;
  protected DatabaseConditions conditions;
  protected DatabaseEvents events;
  protected DatabaseItems items;
  protected DatabaseMonsters monsters;
  protected DatabaseSkills skills;
  protected DatabaseVariables variables;
  protected DatabaseVehicles vehicles;

  public TabDatabase() {
  }

  @FXML
  private void initialize() {
    about = new DatabaseAbout();
    animations = new DatabaseAnimations();
    attributes = new DatabaseAttributes();
    characters = new DatabaseCharacters();
    classes = new DatabaseClasses();
    conditions = new DatabaseConditions();
    events = new DatabaseEvents();
    items = new DatabaseItems();
    monsters = new DatabaseMonsters();
    skills = new DatabaseSkills();
    variables = new DatabaseVariables();
    vehicles = new DatabaseVehicles();
  }

  public void verifyEnable() {
  }
}
