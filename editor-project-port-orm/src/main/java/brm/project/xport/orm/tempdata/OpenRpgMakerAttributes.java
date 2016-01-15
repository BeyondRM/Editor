package brm.project.xport.orm.tempdata;


/**
 * ORM Attribute definition. This allows defining a system attribute, which contains a name, type, and five multipliers
 * (lettered A through E). The multipliers are integer values, generally in the order of 200, 150, 100, 50, and 0; they
 * are used as percentile values in countering other attributes &mdash; take these values and divide by one hundred, to
 * get the actual multiplier.
 * @author Gregory
 */
public class OpenRpgMakerAttributes {
  /**
   * The attribute name.
   * @see OpenRpgMakerAttributes
   */
  private String name = "";
  /**
   * The attribute type.
   * @see OpenRpgMakerAttributes
   */
  private String type = "";
  /**
   * The multiplier 'A'.
   * @see OpenRpgMakerAttributes
   */
  private int multiplierA = 200;
  /**
   * The multiplier 'B'.
   * @see OpenRpgMakerAttributes
   */
  private int multiplierB = 150;
  /**
   * The multiplier 'C'.
   * @see OpenRpgMakerAttributes
   */
  private int multiplierC = 100;
  /**
   * The multiplier 'D'.
   * @see OpenRpgMakerAttributes
   */
  private int multiplierD = 50;
  /**
   * The multiplier 'E'.
   * @see OpenRpgMakerAttributes
   */
  private int multiplierE = 0;

  /**
   * A public constructor.
   * @see OpenRpgMakerAttributes
   */
  public OpenRpgMakerAttributes() {
  }

  /**
   * Get the name.
   * @return A {@link String} object.
   * @see OpenRpgMakerAttributes
   */
  public String getName() {
    return name;
  }

  /**
   * Get the type.
   * @return A {@link String} object.
   * @see OpenRpgMakerAttributes
   */
  public String getType() {
    return type;
  }

  /**
   * Get the multiplier 'A'.
   * @return An {@link Integer} value.
   * @see OpenRpgMakerAttributes
   */
  public int getMultiplierA() {
    return multiplierA;
  }

  /**
   * Get the multiplier 'B'.
   * @return An {@link Integer} value.
   * @see OpenRpgMakerAttributes
   */
  public int getMultiplierB() {
    return multiplierB;
  }

  /**
   * Get the multiplier 'C'.
   * @return An {@link Integer} value.
   * @see OpenRpgMakerAttributes
   */
  public int getMultiplierC() {
    return multiplierC;
  }

  /**
   * Get the multiplier 'D'.
   * @return An {@link Integer} value.
   * @see OpenRpgMakerAttributes
   */
  public int getMultiplierD() {
    return multiplierD;
  }

  /**
   * Get the multiplier 'E'.
   * @return An {@link Integer} value.
   * @see OpenRpgMakerAttributes
   */
  public int getMultiplierE() {
    return multiplierE;
  }

  /**
   * @param s A {@link String} object, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setName(String s) {
    name = s;
  }

  /**
   * @param s A {@link String} object, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setType(String s) {
    type = s;
  }

  /**
   * @param i An {@link Integer} value, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setMultiplierA(int i) {
    multiplierA = i;
  }

  /**
   * @param i An {@link Integer} value, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setMultiplierB(int i) {
    multiplierB = i;
  }

  /**
   * @param i An {@link Integer} value, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setMultiplierC(int i) {
    multiplierC = i;
  }

  /**
   * @param i An {@link Integer} value, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setMultiplierD(int i) {
    multiplierD = i;
  }

  /**
   * @param i An {@link Integer} value, representing the new value.
   * @see OpenRpgMakerAttributes
   */
  public void setMultiplierE(int i) {
    multiplierE = i;
  }
}
