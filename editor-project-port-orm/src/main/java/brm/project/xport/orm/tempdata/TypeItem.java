package brm.project.xport.orm.tempdata;


/**
 * <h2>TypeItem</h2>
 * A type definition. This public enumeration defines the types of items used in Open RPG Maker, version {@code 0.2.3}
 * and previous. It allows for analyzing the items and importing from, or exporting to, the Open RPG Maker items (with
 * some exceptions).
 * <p/>
 * TODO: Do not forget, in my implementation I will also be using some new Equipment sub-categories to expand items. As
 * an example, the Accessories can be further subdivided into such categories as:
 * <pre>
 *    belts (or maybe, suspenders? lol)
 *    boots/footwear
 *    charms/necklaces/rings/symbols/talismans (often, "jewelry")
 *    other types of clothing
 *      capes/cloaks/coats
 * </pre>
 * <p/>
 * These will not be directly exportable to Open RPG Maker and RPG Maker, et cetera, as they might not (yet) allow for
 * tracking of those items as primary-level equipment types.
 * <p/>
 * Where RPG Maker VX Ace separates armors and weapons from the general items definitions, Open RPG Maker kept them all
 * together in the same tab page but uses an "attack attribute" CheckList to specify, for example weapons, which weapon
 * type the item is. On the other hand, in our Beyond RM, we have sub-tabs within the core "Items" project tab.
 * @author Gregory
 */
public enum TypeItem {
  /**
   * A "commonitem". These are for the "Common Items" definitions in Open RPG Maker. They work as mere visual separator
   * between items of different types; they will be unused and useless for my uses.
   * @see TypeItem
   */
  ti0("commonitem"),
  /**
   * A "weapon". This is for the weapon definitions, any of a wide variety of equipment subtypes that can be used for
   * attack. They may have subtypes that are more specific to exactly what type of damage they perform.
   * <p/>
   * In RPG Maker VX Ace (et cetera), weapons are not listed with the rest of the items, but in the Weapons tab. But in
   * Beyond RM,
   * @see TypeItem
   */
  ti1("weapon"),
  /**
   * A "shield". These are for shield definitions, a defensive object generally held by front-line soldiers to guard
   * against attack damage.
   * <p/>
   * In RPG Maker VX Ace (et cetera), shields are not listed with the rest of the items, but in the Armors tab. But in
   * Beyond RM,
   * @see TypeItem
   */
  ti2("shield"),
  /**
   * An "armor". These are for armor definitions, a defensive object worn as clothing or above the clothing to guard
   * against damage.
   * <p/>
   * In RPG Maker VX Ace (et cetera), armors are not listed with the rest of the items, but in the Armors tab. But in
   * Beyond RM,
   * @see TypeItem
   */
  ti3("armor"),
  /**
   * A "helmet". These are for helmet definitions, a defensive object worn specifically upon the head to prevent head
   * damage.
   * <p/>
   * In RPG Maker VX Ace (et cetera), helmets are not listed with the rest of the items, but in the Armors tab. But in
   * Beyond RM,
   * @see TypeItem
   */
  ti4("helmet"),
  /**
   * An "accessory". These are for accessories definitions, a miscellaneous object worn as an additional charm or ward
   * against damage (magic, physical, or otherwise).
   * <p/>
   * In RPG Maker VX Ace (et cetera), accessories are not listed with the rest of the items, but in the Armors tab. But
   * in Beyond RM,
   * @see TypeItem
   */
  ti5("accessory"),
  /**
   * A "medicine". These are for medicine definitions, a consumable item that is used to replenish or restore either
   * some or all of a character's health aspect.
   * @see TypeItem
   */
  ti6("medicine"),
  /**
   * A "skillbook". These are for skill books, a consumable item that is used to "teach" an unknown skill or spell to
   * the character.
   * @see TypeItem
   */
  ti7("skillbook"),
  /**
   * A "seed". These are for seed definitions, a consumable item that is used to permanently increase a specified
   * ability/score.
   * @see TypeItem
   */
  ti8("seed"),
  /**
   * A "skillscroll". These are for skill scroll definitions, a consumable item that is used as stored magic; has a
   * number of uses, and may be depleted.
   * @see TypeItem
   */
  ti9("skillscroll"),
  /**
   * A "switch". These are for switch definitions, a consumable item that is used to turn a boolean "switch" on or off,
   * depending on the value.
   * @see TypeItem
   */
  tiA("switch"),
  /**
   * An "event". These are for event definitions, a consumable item that is used to fire a special event, such as a
   * teleport-item to go somewhere.
   * @see TypeItem
   */
  tiB("event");
  /**
   * The item type. This is the broad type of object that is being analyzed for importation.
   * @see TypeItem
   */
  public final String type;

  private TypeItem(String s) {
    type = s;
  }
}
