package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerSkills {
  public String name;
  public String description;
  public int type;
  public int mpConsumed;
  public boolean isMPNumber;

  //data:
  public String target;
  public int effectRating;
  public int successRate;
  public int battleAnimationID;
  public int globalAnimationID;
  public int attackInfluence;
  public int wisdomInfluence;
  public int variance;
  public boolean changeHP;
  public boolean changeMP;
  public boolean changeAttack;
  public boolean changeDefense;
  public boolean changeWisdom;
  public boolean changeAgility;
  public boolean absorb;
  public boolean ignoreDefense;

  //data/attributes:
  public boolean reduceResistance;
  //  ... CDATA section

  //data/conditions:
  public boolean inflictConditions;
  public int percentEffectiveness;
  //  ... CDATA section

  //data/animationSettings:
  //data/animationSettings/character & data/animationSettings/monster:
  public String movementBeforeAttack;
  public int animationPose;
}
