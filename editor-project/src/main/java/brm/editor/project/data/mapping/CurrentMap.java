package brm.editor.project.data.mapping;


/**
 * The current map being edited. This public utility class contains fields and methods for managing the aspects of a
 * tile-based map, currently in memory.
 * <p/>
 * RPG Maker VX Ace (et al) has the following editable fields in the dialog interface:
 * <pre>
 *     General Settings
 *       name
 *       display name
 *       tileset
 *       width and height
 *       scroll type
 *       default battle background
 *       default background music
 *       default background sound
 *       disable dashing/running?
 *     Parallax Background
 *       graphic used
 *       loop horizontal?
 *       loop vertical?
 *       show in the editor?
 *     Note
 *     Encounters
 *       encounter listbox
 *       number of steps</pre>
 *
 * Open RPG Maker adds to this: selectors to allow or forbid escape, save, and teleport operations by default.
 * @author Gregory
 */
public class CurrentMap {
  public static final CurrentMap instance;

  static {
    instance = new CurrentMap();
  }

  public String mapFile;
  public String mapPath;
  public boolean parallax; // need: parallax background, auto-scroll horizontal/vertical, hor scroll speed, ver scroll speed,
  public int sizeX;
  public int sizeY;
//public WrapMode wrapping;
//public List<MonsEncounter> encounters;
  public String backgroundmusic;  // selectable: same as parent, entrust to event, specify (with selector)
  public String battlebackground; // selectable: same as parent, use terrain settings, specify (with selector)
//public int teleport;  // selectable: same as parent, allow, deny/forbid
//public int escapable; // selectable: same as parent, allow, deny/forbid
//public int saveAllow; // selectable: same as parent, allow, deny/forbid
//public MapTiles tiles;// The tiles on the map. Can have layers, events, and passability.

  private CurrentMap() {
  }
}
