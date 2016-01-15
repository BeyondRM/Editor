package brm.editor.project;


/**
 * The project handler.
 * @author Gregory
 */
public class EditorProject {
  public static final EditorProject instance;

  static {
    instance = new EditorProject();
  }

  private boolean changed;
  private boolean loaded;
  private boolean saved;

  private EditorProject() {
  }

  public final void onProjectBuild() {
  }

  public final void onProjectClose() {
  }

  public final void onProjectExport() {
  }

  public final void onProjectImport() {
  }

  public final void onProjectNew() {
  }

  public final void onProjectOpen() {
  }

  public final void onProjectSave() {
  }

  public final void onProjectSaveAs() {
  }

  public final void on() {
  }

  /**
   * Whether the project is changed. This is relative to the last time it was saved.
   * @return A {@link Boolean} condition.
   */
  public boolean isChanged() {
    return changed;
  }

  /**
   * Whether the project is loaded.
   * @return A {@link Boolean} condition.
   */
  public boolean isLoaded() {
    return loaded;
  }

  /**
   * Whether the project is saved.
   * @return A {@link Boolean} condition.
   */
  public boolean isSaved() {
    return saved;
  }

  /**
   * Set the project as changed.
   * @param b A {@link Boolean} condition, representing the {@link #changed changed} state.
   */
  public void setChanged(boolean b) {
    changed = b;
  }

  /**
   * Set the project as loaded.
   * @param b A {@link Boolean} condition, representing the {@link #loaded loaded} state.
   */
  public void setLoaded(boolean b) {
    if(isLoaded()) {
      changed = true;
    }
    loaded = b;
  }

  /**
   * Set the project as saved.
   * @param b A {@link Boolean} condition, representing the {@link #saved saved} state.
   */
  public void setSaved(boolean b) {
    //TODO: Perform the saving of the project, depending upon other states....
    if(isLoaded()) {
      if(!isChanged() && isSaved() && !b) {
        // not changed, is saved, not 'b'
        saved = b;
      } else if(isChanged() && !isSaved() && b) {
        // is changed, not saved, is 'b'
        saved = b;
      }
    }
  }
}
