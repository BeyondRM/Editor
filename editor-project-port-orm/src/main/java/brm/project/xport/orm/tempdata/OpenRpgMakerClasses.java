package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerClasses {
  public String name;
  public int sprite;
  public int spriteOpacity;
  //options:
  public boolean duelWielding;
  public boolean aiControlled;
  public boolean equipmentLocked;
  public boolean mightyGuard;
  //baseStats:
  //  ... sub-nodes: maxHP, maxMP, attack, defense, wisdom, agility; each are int[] arrays of the character level values
  //experienceCurve:
  public int primary, secondary;
  //battleCommands:
  public int command1, command2, command3, command4, command5, command6;
  //skillProgression:
  //  ... a listing of the skills and the levels they are learned/learnable
  //conditionResists:
  //attributeResists:
}
