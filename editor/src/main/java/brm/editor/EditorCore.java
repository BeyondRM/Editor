package brm.editor;
import abc.errorlogs.log.AbcLogger;
import brm.editor.project.data.ProjectData;
import brm.editor.project.ui.DialogProjectNew;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * The editor core FXML.
 * @author Gregory
 */
public class EditorCore extends BorderPane {
  private final ProjectData projectData = ProjectData.instance;
  private Stage stage;
  //TODO: By necessity, we need to enumerate a few menu items, especially those that can be enabled/disabled....
  // Minimally, we need those which can and should be disabled when no project is open.
  // But more than that, all menu items, because we test for which menu item is being sent.
  @FXML
  protected BorderPane borderPane;
  @FXML
  protected MenuItem miFileProjClose;
  @FXML
  protected MenuItem miFileProjNew;
  @FXML
  protected MenuItem miFileProjOpen;
  @FXML
  protected MenuItem miFileProjProps;
  @FXML
  protected MenuItem miFileExit;
  @FXML
  protected StatusBarPanel statusBar;
  // The Database Tabs: Activity, Database, Mapping, Resources, Screens/Layout, System, Tools
  @FXML
  protected TabActivity activity;
  @FXML
  protected TabDatabase database;
  @FXML
  protected TabMapping mapping;
  @FXML
  protected TabResources resources;
  @FXML
  protected TabSystem system;
  @FXML
  protected TabTools tools;

  public EditorCore() {
  }

  @FXML
  protected void handleButtonAction(ActionEvent ae) {
  }

  @FXML
  protected void handleMenuItemAction(ActionEvent ae) {
    if(ae != null && (ae.getSource() instanceof MenuItem || ae.getSource() instanceof CheckMenuItem)) {
      if(ae.getSource().equals(miFileProjNew)) {
        if(projectData.isOpen()) {
          //TODO: Show a message saying a project is open, what do we want to do?
          // If canceled, we abort this method, and not create the "New Project" dialog.
        }
        // If a project is not open, or was but is now closed, we can now proceed.
        actionProjectNew();
      } else if(ae.getSource().equals(miFileProjNew)) {
        // Create a new project.
      } else if(ae.getSource().equals(miFileProjOpen)) {
        // Open an existing project. Need to verify a project is not open, or if the project is saved.
      } else if(ae.getSource().equals(miFileProjClose)) {
        // Close an open project.
      } else if(ae.getSource().equals(miFileProjProps)) {
        // Check the project properties.
      } else if(ae.getSource().equals(miFileExit)) {
        stage.close();
      } else {
      }
    }
  }

  @FXML
  public void initialize() {
    statusBar = new StatusBarPanel();
    statusBar.setTextField(0, "left");
    statusBar.setTextField(1, "middle");
    statusBar.setTextField(2, "right");
    activity = new TabActivity();
    database = new TabDatabase();
    mapping = new TabMapping();
    resources = new TabResources();
    system = new TabSystem();
    tools = new TabTools();
  }

  private void actionProjectNew() {
    URL url = getClass().getResource("brm/editor/dialog/DialogProjectNew.fxml");
    FXMLLoader loader = new FXMLLoader(url);
    try {
      Parent root = (Parent)loader.load();

      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();

      DialogProjectNew dpn = (DialogProjectNew)loader.getController();
      dpn.setStageAndSetupListeners(stage);
    } catch(IOException ex) {
      String s = String.format("IOException in trying to instantiate a DialogProjectNew.fxml dialog; .", "");
      AbcLogger.logThis(AbcLogger.L1, s, ex);
    }
  }
}
