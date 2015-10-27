package brm.editor.tools.spritery;
import java.util.ArrayList;
import java.util.List;


/**
 * DefaultAges
 * @author Gregory
 */
public class DefaultAges {
  public static final DefaultAges instance;

  static {
    instance = new DefaultAges();
  }

  public final List<String> defaultAges; // apparent age for the graphic base.

  {
    defaultAges = new ArrayList<>(0);
  }

  private DefaultAges() {
  }
}
