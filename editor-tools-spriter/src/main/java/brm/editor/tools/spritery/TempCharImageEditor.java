package brm.editor.tools.spritery;
import java.util.ArrayList;
import java.util.List;


/**
 * A character image editor. This singleton class contains fields and methods for managing the details of the base
 * defaults and currently-selected values for the image being edited or created.
 * <p>
 * This class provides a number of defaults to use, from the application's global data in {@link List} arrays; it also
 * provides some public (but not static) fields and methods to edit the current image properties.
 * @author Gregory
 */
public class TempCharImageEditor {
  public static final TempCharImageEditor instance;
  public static final DefaultAges defaultages = DefaultAges.instance;
  public static final List<String> likelyAges; // apparent age for the graphic base.
  public static final List<String> defaultBody; // the body type -- humanoid, animal, or other.

  static {
    instance = new TempCharImageEditor();
    // the public static fields:
    likelyAges = new ArrayList<>(0);
    defaultBody = new ArrayList<>(0);
  }

  public String currentBodyType;
  /**
   * A current character name. This is a working name of the target character that will be represented in the resulting
   * sprite-sheet.
   * <p>
   * Every character uses a name; although in terms of this application-usage, a 'name' could just as well be a 'title'
   * &mdash; for example, "Mayor" instead of a particular personal name.
   */
  public String currentCharName;
  /**
   * The current gender. This is a single {@link Character} representing the currently-selected gender. This is either
   * an 'f' for 'female', an 'm' for 'male', or an 'n' for 'neuter' gender-identity.
   * <ul>
   * <li/>Male or masculine characters usually mature to include: facial hair, such as beards and mustaches; a somewhat
   * more rugged look, often with angular facial profile; a heavier body, with muscled arms, legs, and torso; and is
   * slightly taller on average.
   * <li/>Female or feminine characters mature to include softer, less-angular features; no facial hair like a beard or
   * mustache; smaller in height and weight, and often a less-muscular build overall. (This latter part does not mean an
   * adult female is necessarily a weakling; but child-rearing and domestic work is often tiring in a way that might not
   * leave time and energy for working on one's musculature.)
   * <li/>Neuter and "non-gendered" characters/races can be anywhere in between. This might be used for beings of a type
   * that does not reproduce the same as humanoid beings.
   * </ul>
   */
  public char currentGenderId;
  public int currentBodyAge;

  {
    currentBodyType = "Adult";
    currentCharName = "(unnamed)";
    currentGenderId = 'm';
  }

  private TempCharImageEditor() {
  }
}
