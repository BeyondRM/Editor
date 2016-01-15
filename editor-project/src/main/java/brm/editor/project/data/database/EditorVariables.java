package brm.editor.project.data.database;
import brm.editor.project.utility.IConvertBinaryInput;
import brm.editor.project.utility.IConvertBinaryOutput;
import brm.editor.project.utility.IConvertMarkupInput;
import brm.editor.project.utility.IConvertMarkupOutput;
import brm.editor.project.utility.IConvertValidation;
import brm.platform.variables.types.VariableArrayBoolean;
import brm.platform.variables.types.VariableArrayByte;
import brm.platform.variables.types.VariableArrayDouble;
import brm.platform.variables.types.VariableArrayFloat;
import brm.platform.variables.types.VariableArrayInteger;
import brm.platform.variables.types.VariableArrayLong;
import brm.platform.variables.types.VariableArrayString;
import brm.platform.variables.types.VariableBoolean;
import brm.platform.variables.types.VariableByte;
import brm.platform.variables.types.VariableDouble;
import brm.platform.variables.types.VariableFloat;
import brm.platform.variables.types.VariableInteger;
import brm.platform.variables.types.VariableLong;
import brm.platform.variables.types.VariableString;
import java.util.List;


/**
 * A public utility class with fields and methods for managing the details of a Variables-Management utility.<p/>
 * In terms of the editor, it needs to control the variables in the variables database or for the assorted subcomponents
 * of the database.<br/>
 * In terms of the engine, it needs to be able to load and edit the variables through the game-play, and save them with
 * the game data being played.
 * @author Gregory
 */
public class EditorVariables implements IConvertBinaryInput, IConvertBinaryOutput, IConvertMarkupInput, IConvertMarkupOutput, IConvertValidation {
  /**
   * A public named array of similar {@link Boolean} conditions.
   */
  public List<VariableArrayBoolean> arrayBooleans;
  /**
   * A public named array of similar {@link Byte} values.
   */
  public List<VariableArrayByte> arrayBytes;
  /**
   * A public named array of similar {@link Double} values.
   */
  public List<VariableArrayDouble> arrayDoubles;
  /**
   * A public named array of similar {@link Float} values.
   */
  public List<VariableArrayFloat> arrayFloats;
  /**
   * A public named array of similar {@link Integer} values.
   */
  public List<VariableArrayInteger> arrayIntegers;
  /**
   * A public named array of similar {@link Long} values.
   */
  public List<VariableArrayLong> arrayLongs;
  /**
   * A public named array of similar {@link String} objects.
   */
  public List<VariableArrayString> arrayStrings;
  /**
   * A public named {@link Boolean} condition.
   */
  public List<VariableBoolean> booleans;
  /**
   * A public named {@link Byte} value.
   */
  public List<VariableByte> bytes;
  /**
   * A public named {@link Double} value.
   */
  public List<VariableDouble> doubles;
  /**
   * A public named {@link Float} value.
   */
  public List<VariableFloat> floats;
  /**
   * A public named {@link Integer} value.
   */
  public List<VariableInteger> integers;
  /**
   * A public named {@link Long} value.
   */
  public List<VariableLong> longs;
  /**
   * A public named {@link String} object.
   */
  public List<VariableString> strings;

  /**
   * A public constructor to instantiate a new {@link EditorVariables} object.
   */
  public EditorVariables() {
  }

  @Override
  public boolean markupSourceExists() {
    return false;
  }

  @Override
  public boolean markupTargetExists() {
    return false;
  }

  @Override
  public void binaryInputBefore() {
    //TODO: Need a methodology to handle what happens before input from a binary source.
  }

  @Override
  public void binaryInputDuring() {
    //TODO: Need a methodology to handle what happens during input from a binary source.
  }

  @Override
  public void binaryInputFinish() {
    //TODO: Need a methodology to handle what happens after input from a binary source.
  }

  @Override
  public void binaryOutputBefore() {
    //TODO: Need a methodology to handle what happens before output to a binary target.
  }

  @Override
  public void binaryOutputDuring() {
    //TODO: Need a methodology to handle what happens during output to a binary target.
  }

  @Override
  public void binaryOutputFinish() {
    //TODO: Need a methodology to handle what happens after output to a binary target.
  }

  @Override
  public void markupInputBefore() {
    //TODO: Need a methodology to handle what happens before xml input.
  }

  @Override
  public void markupInputDuring() {
    //TODO: Need a methodology to handle what happens during xml input.
  }

  @Override
  public void markupInputFinish() {
    //TODO: Need a methodology to handle what happens after xml input.
  }

  @Override
  public void markupOutputBefore() {
    //TODO: Need a methodology to handle what happens before xml output.
  }

  @Override
  public void markupOutputDuring() {
    //TODO: Need a methodology to handle what happens during xml output.
  }

  @Override
  public void markupOutputFinish() {
    //TODO: Need a methodology to handle what happens after xml output.
  }

  @Override
  public void validateBefore() {
    //TODO: Need a methodology to handle what happens before data validation occuring.
  }

  @Override
  public void validateDuring() {
    //TODO: Need a methodology to handle what happens during data validation occuring.
  }

  @Override
  public void validateFinish() {
    //TODO: Need a methodology to handle what happens after data validation occuring.
  }
}
