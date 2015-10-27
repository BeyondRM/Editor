package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerCommonevents {
  public String name;
  public String icon;
  public int extent;
  public int group;
  public int priority;
  public int actionRestriction;
  public int hitPercentage;
  public int animationID;
  //susceptibility:
  public int A, B, C, D, E;
  //recovery:
  public int abatesAfterNumTurns;
  public int perTurnRecoveryChance;
  public int physicalDamageRecoveryChance;
  //statAlterations:
  public int attack, defense, wisdom, agility;
  //preventSkills:
  public boolean withAttackInfluence;
  public int attackInfluence;
  public boolean withWisdomInfluence;
  public int wisdomInfluence;
  //hpEffect & mpEffect:
  public int effect;
  public int percentPerTurn;
  public int amountPerTurn;
  public int amountPerNumSteps;
  public int numSteps;
  //additionalEffects:
  public int evadingChange;
  public int criticalHitsChange;
  public boolean reflectSkill;
  public boolean lockEquipment;
}
