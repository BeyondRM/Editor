package brm.editor.project.data;
import java.io.File;


/**
 * The project data.
 * @author Gregory
 */
public class ProjectData {
  public static final ProjectData instance;
  private static boolean open;
  private static boolean openable;
  private static boolean saveable;
  private static boolean saved;

  static {
    instance = new ProjectData();
    open = false;
  }

  private File fileGamePath;
  private File fileProjPath;
  private String projectName;

  private ProjectData() {
  }

  public boolean isOpen() {
    return open;
  }

  /**
   * A public method to create a project for use in the editor.
   * <p/>
   * The following may apply:
   * <ul>
   * <li/>The file parameter must exist or can be created; and the first String parameter must be a path that can be
   * created.
   * <li/>Both 's' and 't' parameters should not be empty; this represents something unexpected (it should not happen).
   * The 's" parameter is the folder name under the 'f' path below, where the project will reside; the 't' parameter is
   * a more accurate project title &mdash; often, a longer or more descriptive name than the project directory name.
   * </ul>
   * Else, based upon the above, we can analyze the game name and path:
   * <ul>
   * <li/>If the file 'f' location is not valid and cannot be created, show a dialog stating the reason the operation
   * could not be completed.
   * <li/>The New-Project Wizard should handle validation of Strings 's' and 't' before getting to this; but additional
   * aspects apply. If 's' is the same as an existing project folder in this path, show a dialog stating the directory
   * name must be different, or append a numeric value to make it different.
   * </ul>
   * Following the above validation, the paths will be created if necessary, various "template" files will be copied to
   * various subdirectories, and other files will be created as necessary.
   * @param f A {@link File} object, representing the root folder.
   * @param s A {@link String} object, representing the project path name.
   * @param t A {@link String} object, representing the project game name.
   */
  public void createProject(File f, String s, String t) {
    //TODO: Create the methodology for creating a project with the supplied parameters. See the Javadoc comments, above.

    open = true; // The last call; sets 'open' to true so that other methods can check if a project is being edited.
  }
  //TODO: In the future, if forking/creating a project using existing project data, we may need another method to do it.
}
