package brm.editor.project.data.system;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author Gregory
 */
public class SystemTimingMonths {
  public SimpleIntegerProperty number = new SimpleIntegerProperty(0);
  public SimpleStringProperty abbreviation = new SimpleStringProperty("Jan");
  public SimpleStringProperty name = new SimpleStringProperty("January");
  public SimpleIntegerProperty days = new SimpleIntegerProperty(0);
}
