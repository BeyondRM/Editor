package brm.editor.database.items;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author Gregory
 */
public class TemplateSubtypes {
  public final SimpleIntegerProperty number = new SimpleIntegerProperty(0);
  public final SimpleStringProperty abbr = new SimpleStringProperty("");
  public final SimpleStringProperty name = new SimpleStringProperty("");

  public TemplateSubtypes() {
    this(0, "", "");
  }

  public TemplateSubtypes(int i, String s, String t) {
    TemplateSubtypes.this.setNumber(i);
    TemplateSubtypes.this.setAbbr(s);
    TemplateSubtypes.this.setName(t);
  }

  public Integer getNumber() {
    return number.get();
  }

  public String getAbbr() {
    return abbr.get();
  }

  public String getName() {
    return name.get();
  }

  public void setAbbr(String s) {
    abbr.set(s);
  }

  public void setName(String s) {
    name.set(s);
  }

  public void setNumber(int i) {
    number.set(i);
  }
}
