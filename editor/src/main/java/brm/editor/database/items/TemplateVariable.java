package brm.editor.database.items;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author Gregory
 */
public class TemplateVariable {
  protected final SimpleIntegerProperty number = new SimpleIntegerProperty(0);
  protected final SimpleStringProperty name = new SimpleStringProperty("");

  public TemplateVariable() {
    this(0, "");
  }

  public TemplateVariable(int i, String s) {
    TemplateVariable.this.setNumber(i);
    TemplateVariable.this.setName(s);
  }

  public Integer getNumber() {
    return number.get();
  }

  public String getName() {
    return name.get();
  }

  public void setName(String s) {
    name.set(s);
  }

  public void setNumber(int i) {
    number.set(i);
  }
}
