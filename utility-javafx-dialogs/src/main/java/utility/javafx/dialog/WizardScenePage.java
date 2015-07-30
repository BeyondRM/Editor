package utility.javafx.dialog;


/**
 * A wizard scene page definition.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public interface WizardScenePage {
  int pageBack = -1;
  int pageHere = -1;
  int pageNext = -1;

  abstract public boolean allowsPageBack();

  abstract public boolean allowsPageNext();

  abstract public boolean isPageValidate();

  abstract public void doCanceled();

  abstract public void doFinished();

  abstract public void doPageBack();

  abstract public void doPageHelp();

  abstract public void doPageNext();
}
