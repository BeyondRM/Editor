package treeview;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


/**
 * Sample controller class.
 */
public class MyControllerClass {
  // the FXML annotation tells the loader to inject this variable before invoking initialize.
  @FXML
  private TreeView<String> locationTreeView;

  // the initialize method is automatically invoked by the FXMLLoader - it's magic
  private void initialize() {
    loadTreeItems("initial 1", "initial 2", "initial 3");
  }

  // loads some strings into the tree in the application UI.
  public void loadTreeItems(String... rootItems) {
    TreeItem<String> root = new TreeItem<>("Root Node");
    root.setExpanded(true);
    for(String itemString : rootItems) {
      root.getChildren().add(new TreeItem<>(itemString));
    }
    locationTreeView.setRoot(root);
  }
}
