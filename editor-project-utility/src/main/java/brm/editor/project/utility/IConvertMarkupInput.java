package brm.editor.project.utility;
import java.io.File;


/**
 * Convert to markup input.
 * @author Gregory
 * @see #markupInputSource markupInputSource
 * @see #markupInputTarget markupInputTarget
 * @see #markupInputProceed markupInputProceed
 * @see #markupSourceExists() markupSourceExists()
 * @see #markupInputBefore() markupInputBefore()
 * @see #markupInputDuring() markupInputDuring()
 * @see #markupInputFinish() markupInputFinish()
 * @see IConvertMarkupOutput
 */
public interface IConvertMarkupInput {
  /**
   */
  public File markupInputSource = null;
  /**
   */
  public File markupInputTarget = null;
  /**
   */
  public boolean markupInputProceed = true;

  /**
   * Whether the markup source exists.
   * <p>
   * Define a method for checking whether the {@link #markupInputSource markupInputSource} exists at the location. This
   * is useful for validation, to return if the file reference is merely an abstract filename or does not exist.
   * @return A {@link Boolean} condition.
   */
  abstract public boolean markupSourceExists();

  /**
   * Before markup input.
   * <p>
   * Define a methodology to handle what happens before input from a markup source.
   * <p>
   * In general, when performing a conversion from markup source to binary target, you might first perform validation,
   * then set {@link #markupTargetProceed markupTargetProceed} accordingly; this should allow control of whether to
   * continue to the next item to be converted, or interrupt the conversion process.
   */
  abstract public void markupInputBefore();

  /**
   * During markup input.
   * <p>
   * Define a methodology to handle what happens during input from a markup source.
   * <p>
   */
  abstract public void markupInputDuring();

  /**
   * Finish markup input.
   * <p>
   * Define a methodology to handle what happens after input from a markup source.
   * <p>
   * In general, after the conversion process, not a lot should need to be done; however, any cleanup of objects can and
   * should occur in this method. Validation of the resultant output file can be finished, here.
   */
  abstract public void markupInputFinish();
}
