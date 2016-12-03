package brm.editor.project.utility;


/**
 * An interface defining methods for binary output.
 * @author Gregory
 * @see #binaryOutputBefore() binaryOutputBefore()
 * @see #binaryOutputDuring() binaryOutputDuring()
 * @see #binaryOutputFinish() binaryOutputFinish()
 * @see IConverBinaryInput
 */
public interface IConvertBinaryOutput {
  /**
   * Before binary output.
   * <p>
   * Define a methodology to handle what happens before output to a binary target.
   */
  abstract public void binaryOutputBefore();

  /**
   * During binary output.
   * <p>
   * Define a methodology to handle what happens during output to a binary target.
   */
  abstract public void binaryOutputDuring();

  /**
   * Finish binary output.
   * <p>
   * Define a methodology to handle what happens after output to a binary target.
   */
  abstract public void binaryOutputFinish();
}
