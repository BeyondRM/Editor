package brm.project.xport.orm;


/**
 * Import an "Open RPG Maker" project. This is a project with a wizard dialog to import its project's data into a newly
 * created BeyondRM project.
 * @author Gregory
 */
public class ImportOpenRpgMaker {
  public static final ImportOpenRpgMaker instance;

  static {
    instance = new ImportOpenRpgMaker();
  }

  public OpenRpgMaker orm;

  private ImportOpenRpgMaker() {
  }
}
