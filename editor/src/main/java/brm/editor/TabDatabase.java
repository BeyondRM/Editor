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
import javafx.fxml.Initializable;


/**
 * @author Gregory
 */
public class TabDatabase implements Initializable {
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

  @Override
  public void initialize(URL url, ResourceBundle rb) {
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
