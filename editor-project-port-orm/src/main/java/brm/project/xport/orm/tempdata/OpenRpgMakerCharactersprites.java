package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerCharactersprites {
  public String name;
  //mapSprite:
  //battleSprite:

  // both of the above sections, mapSprite and battleSprite, are listings of named character sprite poses;
  // all have String name, String location, boolean pingPong;
  // mapSprite poses have int numLoops;
  // battleSprite poses have int numFrames, int fps;

  // Typical map-based poses are named Idle, Walking, Jumping, and Grappling.
  // Typical in-battle poses are named Idle Stance, Attack, Skill Used, Dieing, Dead, Damaged, Bad Status, Defending,
  //    Running Left, Running Right, Item Used, Wounded, and Victory.
}
