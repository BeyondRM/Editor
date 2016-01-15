package editor.service.xspi.gui;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The UI disable condition.
 * @author Gregory
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_USE)
public @interface UiDisableCondition {
  public String meta = "";
  /**
   * The disabler mode or type.
   * @return A {@link Disabler} instance;
   * @see UiDisableCondition
   */
  public Disabler disabler() default Disabler.project;

  /**
   * Any relevant disabler metadata. This allows the UI element to specify additional methodology or data is pertinent
   * to the element's being disabled.
   * @return A {@link String} object.
   * @see UiDisableCondition
   */
  public String disablerMetadata() default "";

  /**
   * Any relevant enabler metadata. This allows the UI element to specify additional methodology or data is pertinent
   * to the element's being disabled.
   * @return A {@link String} object.
   * @see UiDisableCondition
   */
  public String enablerMetadata() default "";

  /**
   * Can this UI element be disabled.
   * @return A {@link Boolean} condition.
   * @see UiDisableCondition
   */
  public boolean allowDisable() default false;
}
