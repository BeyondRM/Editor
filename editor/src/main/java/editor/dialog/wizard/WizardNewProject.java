package editor.dialog.wizard;
import editor.dialog.wizard.newproject.NewProject;
import editor.dialog.wizard.newproject.NewProjectPath;
import javafx.stage.Window;
import utility.javafx.dialog.DialogUtility;
import utility.javafx.dialog.WizardScene;
import utility.javafx.dialog.WizardScenePage;

/**
 * The "New Project" wizard.
 * @author Gregory
 * @see #instance instance
 * @see #WizardNewProject() WizardNewProject()
 */
public class WizardNewProject {
  /**
   * The default instance.
   * @see #WizardNewProject
   */
  public static final WizardNewProject instance;

  static {
    instance = new WizardNewProject();
  }

  WizardScenePage[] pages;

  {
    pages = new WizardScenePage[] {
      new NewProjectPath()
    };
  }

  private WizardNewProject() {
  }

  public synchronized final void activate(Window w1, String s1, WizardScene ws, int iw) {
    NewProject ws1 = new NewProject(null, null, true);
    DialogUtility.displayWizard(w1, s1, ws, iw);
  }
}
