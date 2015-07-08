package brm.editor.project.utility;
import java.io.File;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * <h2>AEditorProject</h2>
 * An editor project definition. This abstract class defines fields for whether the project data is changed, loaded, or
 * saved; getter and setter methods for the fields; and handler methods to process when project data is built, closed,
 * exported, imported, new, opened, saved, and saved as something else.
 * @author Gregory
 * @see #projectDataChanged projectDataChanged
 * @see #projectDataLoaded projectDataLoaded
 * @see #projectDataSaved projectDataSaved
 * @see #isProjectDataChanged() isProjectDataChanged()
 * @see #isProjectDataLoaded() isProjectDataLoaded()
 * @see #isProjectDataSaved() isProjectDataSaved()
 * @see #onProjectDataBuild() onProjectDataBuild()
 * @see #onProjectDataClose() onProjectDataClose()
 * @see #onProjectDataExport() onProjectDataExport()
 * @see #onProjectDataImport() onProjectDataImport()
 * @see #onProjectDataNew() onProjectDataNew()
 * @see #onProjectDataOpen() onProjectDataOpen()
 * @see #onProjectDataSave() onProjectDataSave()
 * @see #onProjectDataSaveAs() onProjectDataSaveAs()
 * @see #setProjectDataChanged(boolean) setProjectDataChanged(boolean)
 * @see #setProjectDataLoaded(boolean) setProjectDataLoaded(boolean)
 * @see #setProjectDataSaved(boolean) setProjectDataSaved(boolean)
 */
abstract public class AEditorProject extends AMarkup {
  /**
   * Whether project data is changed.
   * @see AEditorProject
   * @see #isProjectDataChanged() isProjectDataChanged()
   * @see #setProjectDataChanged(boolean) setProjectDataChanged(boolean)
   */
  protected boolean projectDataChanged = false;
  /**
   * Whether project data is loaded.
   * @see AEditorProject
   * @see #isProjectDataLoaded() isProjectDataLoaded()
   * @see #setProjectDataLoaded(boolean) setProjectDataLoaded(boolean)
   */
  protected boolean projectDataLoaded = false;
  /**
   * Whether project data is saved.
   * @see AEditorProject
   * @see #isProjectDataSaved() isProjectDataSaved()
   * @see #setProjectDataSaved(boolean) setProjectDataSaved(boolean)
   */
  protected boolean projectDataSaved = false;

  public AEditorProject(File f, String s) {
    super(f, s);
  }

  /**
   * Whether project data is changed.
   * @return A {@link Boolean} condition.
   * @see AEditorProject
   * @see #projectDataChanged projectDataChanged
   */
  abstract public boolean isProjectDataChanged();

  /**
   * Whether project data is loaded.
   * @return A {@link Boolean} condition.
   * @see AEditorProject
   * @see #projectDataLoaded projectDataLoaded
   */
  abstract public boolean isProjectDataLoaded();

  /**
   * Whether project data is saved.
   * @return A {@link Boolean} condition.
   * @see AEditorProject
   * @see #projectDataSaved projectDataSaved
   */
  abstract public boolean isProjectDataSaved();

  /**
   * Handle project data build. This is used for specific functionality to change editor-specific XML data into binary.
   * @see AEditorProject
   */
  abstract public void onProjectDataBuild();

  /**
   * Handle project data close. This is used to close the particular file instance from memory, such as for the project
   * being closed.
   * @see AEditorProject
   */
  abstract public void onProjectDataClose();

  /**
   * Handle project data export. This is used to export the project data to a particular third-party file format. Note:
   * not all features of another file format may be supported; this will export only that which can transfer from our
   * format to the other one...
   * @see AEditorProject
   */
  abstract public void onProjectDataExport();

  /**
   * Handle project data import. This is used to import a particular third-party file format, into our BeyondRM format.
   * Compatibility is attempted, where possible; however, exporting the same data at a later time need not produce the
   * same object result....
   * @see AEditorProject
   */
  abstract public void onProjectDataImport();

  /**
   * Handle project data new. This is used for when the object is created as a new instance, this handles starting with
   * default values, to be edited in the editor.
   * @see AEditorProject
   */
  abstract public void onProjectDataNew();

  /**
   * Handle project data open. This is for functionality to handle the object being opened for editing.
   * @see AEditorProject
   */
  abstract public void onProjectDataOpen();

  /**
   * Handle project data save. This is for functionality to handle the object being saved in its XML format.
   * @see AEditorProject
   */
  abstract public void onProjectDataSave();

  /**
   * Handle project data save-as. This is for functionality to handle the object being saved in its XML format, with a
   * different filename.
   * @see AEditorProject
   */
  abstract public void onProjectDataSaveAs();

  /**
   * Set the changed condition.
   * @param b A {@link Boolean} condition, representing the {@link #projectDataChanged projectDataChanged} state.
   * @see AEditorProject
   * @see #projectDataChanged projectDataChanged
   */
  abstract public void setProjectDataChanged(boolean b);

  /**
   * Set the loaded condition.
   * @param b A {@link Boolean} condition, representing the {@link #projectDataLoaded projectDataLoaded} state.
   * @see AEditorProject
   * @see #projectDataLoaded projectDataLoaded
   */
  abstract public void setProjectDataLoaded(boolean b);

  /**
   * Set the saved condition.
   * @param b A {@link Boolean} condition, representing the {@link #projectDataSaved projectDataSaved} state.
   * @see AEditorProject
   * @see #projectDataSaved projectDataSaved
   */
  abstract public void setProjectDataSaved(boolean b);

//abstract public void on();

  /**
   * Get the node's value, by tag name.
   * @param e An {@link Element} object, representing where the search occurs.
   * @param s A {@link String} object, representing the tag name to find.
   * @return A {@link String} object.
   */
  public String getValue(Element e, String s) {
    NodeList nl = e.getElementsByTagName(s).item(0).getChildNodes();
    Node n = nl.item(0);
    return n.getNodeValue();
  }
}
