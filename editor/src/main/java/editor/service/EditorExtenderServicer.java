package editor.service;
import editor.service.xspi.EditorExtender;
import editor.service.xspi.gui.AEditorUi;
import java.util.ServiceLoader;


/**
 * The Editor Servicer. This is the master class that handles relevant SPI (Service-Provider Implementation) abstracted
 * classes and interfaces.
 * @author Gregory
 */
public class EditorExtenderServicer {
  public static final EditorExtenderServicer instance;

  static {
    instance = new EditorExtenderServicer();
  }

  private final ServiceLoader<EditorExtender> extenders;

  {
    extenders = ServiceLoader.load(EditorExtender.class);
  }

  public void loadUi() {
    // 1. get the tabbed components
    for(EditorExtender extender : extenders) {
      AEditorUi ui = extender.getUiTabbed();
      if(ui != null) {
        // add the UI elements.
      }
    }
    // 2. get the dialog components
    for(EditorExtender extender : extenders) {
      AEditorUi ui = extender.getUiTabbed();
      if(ui != null) {
        // add the UI elements.
      }
    }
  }
}
