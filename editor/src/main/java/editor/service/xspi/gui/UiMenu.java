package editor.service.xspi.gui;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 * @author Gregory
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UiMenu {
  /**
   * The menu icon. This is the image reference used for the menu entry, if it has an icon.
   * @return A {@link String} object.
   * @see UiMenu
   */
  public String icon() default "";

  /**
   * @return A {@link String} object.
   * @see UiMenu
   */
  public String i18nBundle() default "null";

  /**
   * @return A {@link String} object.
   * @see UiMenu
   */
  public String i18nString() default "null";

  /**
   * The parent menu name. This is the text for the menu entry.
   * <p>
   * It has no default entry because the developer must provide one, for correct functionality.
   * @return A {@link String} object.
   * @see UiMenu
   */
  public String name();

  /**
   * The menu title. This is the text for the menu entry. If the supplied text contains a "#" (hash tag or pound sign),
   * and has no spaces, then the text is a link to an internationalized text string.
   * <p>
   * It has no default entry because the developer must provide one, for correct functionality.
   * @return A {@link String} object.
   * @see UiMenu
   */
  public String title();

  /**
   * The disabling condition(s). This array of one or more conditional instances defines when or how an interface item,
   * such as it is, cannot be used.
   * @return A {@link UiDisableCondition} array.
   * @see UiMenu
   */
  public UiDisableCondition[] disableCondition() default {};

  /**
   * The menu position. This is an ordinal number, which defines the general order of all menu items.
   * @return A {@link String} object.
   * @see UiMenu
   */
  public int order() default 1000;
}
