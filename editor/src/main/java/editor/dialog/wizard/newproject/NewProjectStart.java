package editor.dialog.wizard.newproject;
import utility.javafx.dialog.WizardScenePage;


/**
 * @author Gregory
 */
public class NewProjectStart implements WizardScenePage {

  @Override
  public boolean allowsPageBack() {
    return false;
  }

  @Override
  public boolean allowsPageNext() {
    return false;
  }

  @Override
  public boolean isPageValidate() {
    return false;
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
