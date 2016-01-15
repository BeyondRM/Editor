package editor.service.xspi;
import editor.service.xspi.gui.AEditorUi;
import editor.service.xspi.gui.Disabler;
import editor.service.xspi.gui.UiDisableCondition;
import editor.service.xspi.gui.UiMenu;


/**
 * The Editor Extender. This abstract class is used to control the logic behind whether any user-interface elements are
 * to be added into the main editor window, and if any dialogs are to be added to a tool-bar or menu location.
 * @author Gregory
 */
abstract public class EditorExtender {
  /**
   * Dialog UI. For dialogs that can be called from a menu or tool-bar option.
   */
  private final AEditorUi uiDialog;
  /**
   * Tabbed UI. For tabbed-panel user interface elements placed in the main form.
   */
  private final AEditorUi uiTabbed;

  public EditorExtender(AEditorUi ui1, AEditorUi ui2) {
    uiDialog = ui1;
    uiTabbed = ui2;
  }

  /**
   * Get the dialog UI. This is for dialog boxes that are used to perform standalone tasks that can or should be active
   * from a main menu or one of a number of tool-bars. As such, dialogs that are <i>only</i> executed from any other UI
   * components need not be added via this location
   * @return An {@link AEditorUi} object.
   */
  @UiMenu(name = "",
          order = 100,
          title = "Something",
          disableCondition = {
            @UiDisableCondition(allowDisable = true, disabler = Disabler.project, disablerMetadata = "")
          })
  public AEditorUi getUiDialog() {
    return uiDialog;
  }

  /**
   * Get the tabbed UI. This is for tabbed-panel components that are used to add content panels to the tabbed interface
   * in the application window.
   * @return An {@link AEditorUi} object.
   */
  public AEditorUi getUiTabbed() {
    return uiTabbed;
  }
}
