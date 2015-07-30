package utility.javafx.dialog;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;


/**
 * A static dialog handler.
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public final class DialogUtility {
  private static volatile Stage stage;

  /**
   * A private constructor.
   * @see DialogUtility
   */
  private DialogUtility() {
  }

  /**
   * Create a dialog stage. This takes a number of parameterized objects to create an active dialog window.
   * @param w A {@link Window} object, representing the parent window.
   * @param s A {@link StageStyle} object, representing the stage style.
   * @param t A {@link String} object, representing the dialog title.
   * @param i An {@link Integer} value, representing the minimal width.
   * @see DialogUtility
   * @see Modality
   * @see Stage
   * @see StageStyle
   * @see String
   * @see Window
   */
  private static synchronized void stageCreate(Window w, StageStyle s, String t, int i) {
    DialogUtility.stageFinish();
    stage = new Stage(s);
    stage.initOwner(w);
    stage.initModality(Modality.WINDOW_MODAL);
    stage.setTitle(t);
    stage.setMinWidth(i);
  }

  /**
   * Dispose of the dialog.
   * @see DialogUtility
   */
  private static synchronized void stageFinish() {
    if(stage != null) {
      stage = null;
    }
  }

  /**
   * Display a Scene object. This instantiates a dialog window with the following parameters:
   * @see DialogUtility
   */
  public static synchronized final void displayContent(Window window, String title, Scene scene, int width) {
    DialogUtility.stageCreate(window,
                              Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                  ? StageStyle.UNIFIED
                                  : StageStyle.UNDECORATED,
                              title, width);

    stage.setScene(scene);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }

  /**
   * Display a String message.
   * @param window  A {@link Window} object, representing the parent window.
   * @param title   A {@link String} object, representing the dialog title.
   * @param message A {@link String} object, representing the message text.
   * @param width   An {@link Integer} value, representing the minimal width.
   * @see DialogUtility
   */
  public static synchronized final void displayMessage(Window window, String title, String message, int width) {
    DialogUtility.stageCreate(window,
                              Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                  ? StageStyle.UNIFIED
                                  : StageStyle.UNDECORATED,
                              title, width);

    Label label = new Label(message);
    Button button = new Button("Close");

    VBox vb = new VBox(label, button);
    vb.setAlignment(Pos.CENTER);

    Scene scene = new Scene(vb);
    stage.setScene(scene);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }

  /**
   * Display a wizard-style dialog. This is used to show a multi-step dialog that can iteratively process a methodology
   * for creating or editing data.
   * @param window A {@link Window} object, representing the parent window.
   * @param title  A {@link String} object, representing the dialog title.
   * @param scene  A {@link WizardScene} object, representing the wizard content.
   * @param width  An {@link Integer} value, representing the minimal width.
   * @see DialogUtility
   */
  public static synchronized final void displayWizard(Window window, String title, WizardScene scene, int width) {
    DialogUtility.stageCreate(window,
                              Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                  ? StageStyle.UNIFIED
                                  : StageStyle.UNDECORATED,
                              title, width);

    stage.setScene(scene);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }
}
