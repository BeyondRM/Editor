package brm.editor.project.utility;


/**
 *
 * @author Gregory
 * @see #validateBefore() validateBefore()
 * @see #validateDuring() validateDuring()
 * @see #validateFinish() validateFinish()
 */
public interface IConvertValidation {
  public boolean isValid = false;

  /**
   * Define a methodology to handle what happens before validation of project data.
   * <p>
   */
  abstract public void validateBefore();

  /**
   * Define a methodology to handle what happens during validation of project data.
   * <p>
   */
  abstract public void validateDuring();

  /**
   * Define a methodology to handle what happens after validation of project data.
   * <p>
   */
  abstract public void validateFinish();
}
