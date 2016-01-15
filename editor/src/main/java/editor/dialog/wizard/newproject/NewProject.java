package editor.dialog.wizard.newproject;
import javafx.scene.Scene;
import utility.javafx.dialog.WizardScene;
import utility.javafx.dialog.WizardScenePage;


/**
 * The new project scene.
 * @author Gregory
 */
public class NewProject extends WizardScene {
  protected static final WizardScenePage[] pages;

  static {
    pages = new WizardScenePage[] {
      new NewProjectPath()
    };
  }

  public NewProject(Scene sh, Scene sf, boolean showButtons) {
    super(sh,
          sf,
          showButtons,
          NewProject.pages);
  }
}
