package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerMaps {
  public String name;
  public int width, height, parent;
  public String horizontalMode, verticalMode, borderTile, teleport, escape, save;
  //bgm & bbg:
  //  ... both of above only have one attribute: String type. bgm seems to be background music, and bbg seems to be related to terrain.
  //bg:
  public int hscrollspeed, vscrollspeed;
  public boolean autohscroll, autovscroll;
  public String location;
  //layer:
  //  ^ one "layer" node per actual "layer" of the map
  //onLoadEvent:
  //  ... probably, similar to the definition of onLoadEvent for the menu layouts
  //mapEvents:
  //  ... the list of events for the items, npcs, encounters the characters will come across. Defined below, in comment.
  //monsterencounters:
  public int encounterrate, minperbattle, maxperbattle;
  //areas:
  //  ... the areas, on a map? for limiting movement of NPCs and monsters?

}
/* Each event on a map can be named and given an x/y position. It also defines a "page" with a number of properties.
 */
