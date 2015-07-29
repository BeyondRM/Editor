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
public class DialogUtility {
  private static volatile Stage stage;

  private DialogUtility() {
  }

  private static synchronized void stageCreate(Window window, StageStyle style, String title) {
    DialogUtility.stageFinish();
    stage = new Stage(style);
    stage.initOwner(window);
    stage.initModality(Modality.WINDOW_MODAL);
    stage.setTitle(title);
    stage.setMinWidth(256);
  }

  private static synchronized void stageFinish() {
    if(stage != null) {
      stage = null;
    }
  }

  public static synchronized final void displayContent(Window window, String title, Scene scene) {
    DialogUtility.stageCreate(window,
                             Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                 ? StageStyle.UNIFIED
                                 : StageStyle.UNDECORATED,
                             title);

    stage.setScene(scene);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }

  public static synchronized final void displayMessage(Window window, String title, String message) {
    DialogUtility.stageCreate(window,
                             Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                 ? StageStyle.UNIFIED
                                 : StageStyle.UNDECORATED,
                             title);

    Label label = new Label(message);
    Button button = new Button("Close");

    VBox vb = new VBox(label, button);
    vb.setAlignment(Pos.CENTER);

    Scene scene = new Scene(vb);
    stage.setScene(scene);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }

  public static synchronized final void displayWizard(Window window, String title, WizardScene ws) {
    DialogUtility.stageCreate(window,
                             Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
                                 ? StageStyle.UNIFIED
                                 : StageStyle.UNDECORATED,
                             title);

    stage.setScene(ws);
    stage.showAndWait();
    DialogUtility.stageFinish();
  }
}
