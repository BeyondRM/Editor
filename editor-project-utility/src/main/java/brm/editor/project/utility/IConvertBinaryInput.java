package brm.editor.project.utility;
import java.io.File;


/**
 * An interface defining methods for binary input.
 * @author Gregory
 * @see #binaryInputSource binaryInputSource
 * @see #binaryInputTarget binaryInputTarget
 * @see #binaryInputBefore() binaryInputBefore()
 * @see #binaryInputDuring() binaryInputDuring()
 * @see #binaryInputFinish() binaryInputFinish()
 * @see IConverBinaryOutput
 */
public interface IConvertBinaryInput {
  /**
   * The binary input source file.
   * <p>
   * In the binary input process, this is the source file to be read in. We start with a binary file that will be parsed
   * by our class; the only expectation is that is can be opened as a {@link FileInputStream} object for conversion.
   */
  public File binaryInputSource = null;
  /**
   * The binary input target file.
   * <p>
   * In the binary input process, this is the target file to be written. We create a file that can be streamed to, as a
   * {@link FileOutputStreama} object.
   */
  public File binaryInputTarget = null;

  /**
   * Before binary input.
   * <p>
   * Define a methodology to handle what happens before input from a binary source.
   */
  abstract public void binaryInputBefore();

  /**
   * During binary input.
   * <p>
   * Define a methodology to handle what happens during input from a binary source.
   */
  abstract public void binaryInputDuring();

  /**
   * Finish binary input.
   * <p>
   * Define a methodology to handle what happens after input from a binary source.
   */
  abstract public void binaryInputFinish();
}
