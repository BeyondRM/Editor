package brm.editor.project.utility;
import java.io.File;


/**
 * Convert to markup output.
 * @author Gregory
 * @see #markupOutputSource markupOutputSource
 * @see #markupOutputTarget markupOutputTarget
 * @see #markupTargetProceed markupTargetProceed
 * @see #markupTargetExists() markupTargetExists()
 * @see #markupOutputBefore() markupOutputBefore()
 * @see #markupOutputDuring() markupOutputDuring()
 * @see #markupOutputFinish() markupOutputFinish()
 * @see IConvertMarkupInput
 */
public interface IConvertMarkupOutput {
  /**
   */
  public File markupOutputSource = null;
  /**
   */
  public File markupOutputTarget = null;
  /**
   */
  public boolean markupTargetProceed = true;

  /**
   * Whether the markup target exists.
   * <p>
   * Define a method for checking whether the {@link #markupOutputSource markupOutputSource} exists at the location.
   * This is useful for validation, to return if the file reference is merely an abstract filename or does not exist.
   * @return A {@link Boolean} condition.
   */
  abstract public boolean markupTargetExists();

  /**
   * Before markup output.
   * <p>
   * Define a methodology to handle what happens before output to a markup target.
   * <p>
   * In general, when performing a conversion from binary source to markup target, you might first perform validation,
   * then set {@link #markupTargetProceed markupTargetProceed} accordingly; this should allow control of whether to
   * continue to the next item to be converted, or interrupt the conversion process.
   */
  abstract public void markupOutputBefore();

  /**
   * During markup output.
   * <p>
   * Define a methodology to handle what happens during output to a markup target.
   * <p>
   */
  abstract public void markupOutputDuring();

  /**
   * Finish markup output.
   * <p>
   * Define a methodology to handle what happens after output to a markup target.
   * <p>
   * In general, after the conversion process, not a lot should need to be done; however, any cleanup of objects can and
   * should occur in this method. Validation of the resultant output file can be finished, here.
   */
  abstract public void markupOutputFinish();
}
