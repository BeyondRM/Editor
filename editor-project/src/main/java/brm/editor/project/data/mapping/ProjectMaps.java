package brm.editor.project.data.mapping;
import java.util.ArrayList;
import java.util.List;


/**
 * The Project Maps. This class handles the list of maps within the project; it allows adding new maps via a dialog.
 * <p/>
 * Maps each have their own properties, so this class will only deal with the meta-mapping attributes.
 * @author Gregory
 */
public class ProjectMaps {
  /**
   * The project maps instance. This is the singleton instance, used to ensure that only one instance of this class can
   * be accessed.
   * @see ProjectMaps
   */
  public static final ProjectMaps instance;

  static {
    instance = new ProjectMaps();
  }

  /**
   * The public list of maps. This is a {@link List} of individual maps in an array-type list field; maps can be added
   * or removed from it, as well as other methods.
   * <p/>
   * TODO: Do we always need to create at least one map, even if no project is open?
   * @see ProjectMaps
   */
  public final List<ProjectMap> maps;

  {
    maps = new ArrayList<>(10);
  }

  /**
   * A private constructor. Goes nowhere, does nothing.
   * @see ProjectMaps
   */
  private ProjectMaps() {
  }

  //TODO: Additional methods for map-list management. Add/create, copy/duplicate, delete, export and import, et cetera.
  // Adding a new map, or creating via a wizard or map template, is the easiest first step. It allows for customization
  // of the new map's properties in a dialog, and may include map-generation based on known mapping templates.
  // Copying (duplication) of existing maps allows a series of maps to be designed, so that the same locations can show
  // the area in multiple states; one example is for a village that is open to all, then the village after being burned
  // by fire, then later when the village is being repaired and rebuilt. (A prime example of this was Radat in Suikoden
  // II.)
  // And should a map no longer be relevant to the game, it can be deleted (or "stashed", in some fashion) to remove it
  // from the project build cycle. The final alternative is to have it completely removed entirely.
  // Options for exporting and importing maps, to and from other formats, or even in regards to other BeyondRM projects
  // should be a possibility. This is to allow as wide a compatibility level as possible.
  // Additional meta-map operations may also be possible.

  /**
   * Meta-Map Operations. The following methods should most likely launch dialog boxes: for confirmation, for obtaining
   * user input, et cetera.
   */

  /**
   * Add a map. This method allows for adding in a new map into the list of map data.
   * @see ProjectMaps
   */
  public synchronized final void mapAdd() {
  }

  /**
   * Copy a map. This method allows for duplicating a selected map to one or more clones of itself.
   * @see ProjectMaps
   */
  public synchronized final void mapCopy() {
  }

  /**
   * Delete a map. This method allows for removing a selected map from the maps list. The user could specify whether or
   * not to stash or store the map being removed, in case it may be re-added at a later time.
   * @see ProjectMaps
   */
  public synchronized final void mapDelete() {
  }

  /**
   * Export a map. This method allows for writing map data out to other program formats. Output options may be obtained
   * via a wizard dialog.
   * @see ProjectMaps
   */
  public synchronized final void mapExport() {
  }

  /**
   * Import a map. This method allows for reading map data in from other program formats. Input options may be obtained
   * via a wizard dialog.
   * @see ProjectMaps
   */
  public synchronized final void mapImport() {
  }
}
