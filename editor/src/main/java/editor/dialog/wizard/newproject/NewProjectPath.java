package editor.dialog.wizard.newproject;
import java.io.File;
import utility.javafx.dialog.WizardScenePage;


/**
 * The new project path.
 * @author Gregory
 */
public class NewProjectPath implements WizardScenePage {
  protected File path;
  protected String projectName;

  {
    path = StaticData.projectPath; // Should initially be set to user's global project path ... ?
    projectName = StaticData.projectName;
  }

  @Override
  public boolean allowsPageBack() {
    return false;
  }

  @Override
  public boolean allowsPageNext() {
    return isPageValidate();
  }

  @Override
  public boolean isPageValidate() {
    return path != null && path.isDirectory();
  }

  @Override
  public void doCanceled() {
  }

  @Override
  public void doFinished() {
  }

  @Override
  public void doPageBack() {
  }

  @Override
  public void doPageHelp() {
  }

  @Override
  public void doPageNext() {
  }
}
