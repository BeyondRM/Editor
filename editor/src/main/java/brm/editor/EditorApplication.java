package brm.editor;
import abc.errorlogs.log.AbcLogger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * <h2>EditorApplication</h2>
 * @author Gregory
 */
public class EditorApplication extends Application {
  private Parent parent;
  private Scene scene;

  public EditorApplication() {
    AbcLogger.logThis(AbcLogger.L3, "EditorApplication() constructor.");
  }

  @Override
  public void init() throws Exception {
    AbcLogger.logThis(AbcLogger.L3, "EditorApplication.init() method.");
  }

  @Override
  public void start(Stage stage) throws Exception {
    AbcLogger.logThis(AbcLogger.L3, "EditorApplication.start() method begin.");

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/brm/editor/EditorCore.fxml"));
    parent = loader.load();
    AbcLogger.logThis(AbcLogger.L3, "\tThe 'parent' object is construted.");

    scene = new Scene(parent);
    scene.setRoot(parent);
    AbcLogger.logThis(AbcLogger.L3, "\tThe 'scene' object is construted and setRoot().");

  //stage.initOwner(null);
    stage.setScene(scene);
    stage.setTitle("BeyondRM +FXML :: An Alternative RPG Maker");
    stage.show();
    AbcLogger.logThis(AbcLogger.L3, "\tThe 'stage' object is setScene(scene), setTitle(String), and show().");

    AbcLogger.logThis(AbcLogger.L3, "EditorApplication.start() method final.");
  }

  @Override
  public void stop() throws Exception {
    AbcLogger.logThis(AbcLogger.L3, "EditorApplication.stop() method.");
  }
}
