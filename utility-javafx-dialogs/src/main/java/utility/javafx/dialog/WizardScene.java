package utility.javafx.dialog;
import javafx.scene.Scene;


/**
 * A stage for wizard-style dialogs. This allows instantiating a list of scenes to be used as content-pages.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
abstract public class WizardScene extends Scene {
  private final Scene foot;
  private final Scene head;
  private final WizardScenePage[] page;
  private final boolean showButtons;

  public WizardScene(Scene sh, Scene sf, boolean showButtons, WizardScenePage... sp) {
    super(null);
    head = sh;
    foot = sf;
    this.showButtons = showButtons;
    page = sp;
  }

  public final void clickWizardDoneExit() {
  }

  public final void clickWizardEscapeMe() {
  }

  public final void clickWizardPageBack() {
  }

  public final void clickWizardPageNext() {
  }
}
