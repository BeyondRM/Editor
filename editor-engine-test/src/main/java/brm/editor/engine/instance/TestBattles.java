package brm.editor.engine.instance;


/**
 * An instance of a battle test.
 * @author Gregory
 */
public class TestBattles extends InstanceTest {
  /**
   * A public constructor.
   * <p>
   * This is one of two ways to allow test-playing of battle scenarios; the other way is via including the test classes
   * in the game engine itself &mdash; but then it would be available for players as well. Not necessarily a bad thing,
   * but some game authors may not want their target players to be able to select random battles to play, over and over
   * again, because then the players might start pointing out monster and character imbalances that a game author might
   * know about already. &mdash; On the other hand, including a free battle-test in the engine release might be desired
   * by many players for an occasional diversion from the main game.
   */
  public TestBattles() {
  }
}
