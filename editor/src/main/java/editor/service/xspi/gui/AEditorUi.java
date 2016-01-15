package editor.service.xspi.gui;


/**
 * An editor extension user-interface definition.
 * @author Gregory
 */
abstract public class AEditorUi {
  // this is where we instantiate any custom editor user-interface components, if necessary.

  public AEditorUi() {
  }

  public abstract void onEditorCoreInit();

  abstract public void onEditorCoreQuit();

  abstract public void onEditorProjLoad();

  abstract public void onEditorProjSave();

  abstract public void onEditorProjQuit();
}
