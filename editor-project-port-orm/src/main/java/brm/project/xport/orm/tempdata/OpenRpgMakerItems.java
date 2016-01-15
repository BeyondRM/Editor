package brm.project.xport.orm.tempdata;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerItems {
  public String name;
  public String description;
  public int price;
  public String type;
  public int numberOfUses;
  //usableBy:
  public String usableBy; // either "heroes" or "classes" ... might be better as an enum instance?
  //  ^ the CDATA section is a listing of (space-separated) character IDs or class IDs that can use this item.
  //cureCondition:
  //  ... a String of 1/0 bits denoting the on/off state of which conditions this item cures.
  //options:
  public int percentRestoredHP, amountRestoredHP, percentRestoredMP, amountRestoredMP;
  public boolean targetsSingleAlly, onlyUsableOnFieldMap, onlyUsableOnDeadCharacters;
}
