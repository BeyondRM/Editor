package brm.project.xport.orm.tempdata;
import brm.editor.project.utility.AEditorProject;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author Gregory
 */
public class OpenRpgMakerCharacters extends AEditorProject {
  private String name = "Charles";
  private int minLevel = 1;
  private int maxLevel = 99;
  private int classID = -1;
  private int unarmedBattleAnimation = 0;
  private int aiLevel = 0;
  // options:
  private boolean duelWielding = false;
  private boolean aiControlled = false;
  private boolean equipmentLocked = false;
  private boolean mightyGuard = false;
  // criticalHits:
  private boolean hasCriticalHits = true;
  private int rate = 3;
  private int multiplier = 2;
  // graphics:
  private int faceGraphic;
  private int spriteOpacity = 100;
  private int sprite = 0;
  // baseStats:
  private int[] maxHP;
  private int[] maxMP;
  private int[] atack;
  private int[] defense;
  private int[] wisdom;
  private int[] agility;
  // experienceCurve
  private int primary;
  private int secondary;
  // battleCommands;  values start as -1 and are set to 0 or above when choice is made.
  private int command1;
  private int command2;
  private int command3;
  private int command4;
  private int command5;
  private int command6;
  // startingEquipment:
  private int weapon;
  private int shield;
  private int armor;
  private int helmet;
  private int accessory;
  // skillProgression:
  //   ... (TODO: need to set this in a project to see what it does....
  // comditionResists:
  private String conditionResists;
  // attributeResists:
  private String attributeResists;
  // battleEvent
  //   ... (TODO: need to set this in a project to see what it does....
  // customAI
  //   ... (TODO: need to set this in a project to see what it does....

  public OpenRpgMakerCharacters() throws ParserConfigurationException, SAXException, IOException {
    this(null);
  }

  public OpenRpgMakerCharacters(File file) throws ParserConfigurationException, SAXException, IOException {
    super(file, "");
  }

  private void parse() {
  }

  @Override
  public boolean isProjectDataChanged() {
    return projectDataChanged;
  }

  @Override
  public boolean isProjectDataLoaded() {
    return projectDataLoaded;
  }

  @Override
  public boolean isProjectDataSaved() {
    return projectDataSaved;
  }

  @Override
  public void onProjectDataBuild() {
  }

  @Override
  public void onProjectDataClose() {
  }

  @Override
  public void onProjectDataExport() {
  }

  @Override
  public void onProjectDataImport() {
  }

  @Override
  public void onProjectDataNew() {
  }

  @Override
  public void onProjectDataOpen() {
  }

  @Override
  public void onProjectDataSave() {
  }

  @Override
  public void onProjectDataSaveAs() {
  }

  @Override
  public void setProjectDataChanged(boolean b) {
    projectDataChanged = b;
  }

  @Override
  public void setProjectDataLoaded(boolean b) {
    projectDataLoaded = b;
  }

  @Override
  public void setProjectDataSaved(boolean b) {
    projectDataSaved = b;
  }

  public String getAttributeResists() {
    return attributeResists;
  }

  public String getConditionResists() {
    return conditionResists;
  }

  public String getName() {
    return name;
  }

  public boolean isAiControlled() {
    return aiControlled;
  }

  public boolean isDuelWielding() {
    return duelWielding;
  }

  public boolean isEquipmentLocked() {
    return equipmentLocked;
  }

  public boolean isHasCriticalHits() {
    return hasCriticalHits;
  }

  public boolean isMightyGuard() {
    return mightyGuard;
  }

  public int getAccessory() {
    return accessory;
  }

  public int getAiLevel() {
    return aiLevel;
  }

  public int getArmor() {
    return armor;
  }

  public int getClassID() {
    return classID;
  }

  public int getCommand1() {
    return command1;
  }

  public int getCommand2() {
    return command2;
  }

  public int getCommand3() {
    return command3;
  }

  public int getCommand4() {
    return command4;
  }

  public int getCommand5() {
    return command5;
  }

  public int getCommand6() {
    return command6;
  }

  public int getFaceGraphic() {
    return faceGraphic;
  }

  public int getHelmet() {
    return helmet;
  }

  public int getMaxLevel() {
    return maxLevel;
  }

  public int getMinLevel() {
    return minLevel;
  }

  public int getMultiplier() {
    return multiplier;
  }

  public int getPrimary() {
    return primary;
  }

  public int getRate() {
    return rate;
  }

  public int getSecondary() {
    return secondary;
  }

  public int getShield() {
    return shield;
  }

  public int getWeapon() {
    return weapon;
  }

  public int getSprite() {
    return sprite;
  }

  public int getSpriteOpacity() {
    return spriteOpacity;
  }

  public int getUnarmedBattleAnimation() {
    return unarmedBattleAnimation;
  }

  public int[] getAgility() {
    return agility.clone();
  }

  public int[] getAtack() {
    return atack.clone();
  }

  public int[] getDefense() {
    return defense.clone();
  }

  public int[] getMaxHP() {
    return maxHP.clone();
  }

  public int[] getMaxMP() {
    return maxMP.clone();
  }

  public int[] getWisdom() {
    return wisdom.clone();
  }

  public void setAccessory(int accessory) {
    this.accessory = accessory;
  }

  public void setAgility(int[] agility) {
    this.agility = agility.clone();
  }

  public void setAiControlled(boolean aiControlled) {
    this.aiControlled = aiControlled;
  }

  public void setAiLevel(int aiLevel) {
    this.aiLevel = aiLevel;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  public void setAtack(int[] atack) {
    this.atack = atack.clone();
  }

  public void setAttributeResists(String attributeResists) {
    this.attributeResists = attributeResists;
  }

  public void setClassID(int classID) {
    this.classID = classID;
  }

  public void setCommand1(int command1) {
    this.command1 = command1;
  }

  public void setCommand2(int command2) {
    this.command2 = command2;
  }

  public void setCommand3(int command3) {
    this.command3 = command3;
  }

  public void setCommand4(int command4) {
    this.command4 = command4;
  }

  public void setCommand5(int command5) {
    this.command5 = command5;
  }

  public void setCommand6(int command6) {
    this.command6 = command6;
  }

  public void setConditionResists(String conditionResists) {
    this.conditionResists = conditionResists;
  }

  public void setDefense(int[] defense) {
    this.defense = defense.clone();
  }

  public void setDuelWielding(boolean duelWielding) {
    this.duelWielding = duelWielding;
  }

  public void setEquipmentLocked(boolean equipmentLocked) {
    this.equipmentLocked = equipmentLocked;
  }

  public void setFaceGraphic(int faceGraphic) {
    this.faceGraphic = faceGraphic;
  }

  public void setHasCriticalHits(boolean hasCriticalHits) {
    this.hasCriticalHits = hasCriticalHits;
  }

  public void setHelmet(int helmet) {
    this.helmet = helmet;
  }

  public void setMaxHP(int[] maxHP) {
    this.maxHP = maxHP.clone();
  }

  public void setMaxLevel(int maxLevel) {
    this.maxLevel = maxLevel;
  }

  public void setMaxMP(int[] maxMP) {
    this.maxMP = maxMP.clone();
  }

  public void setMightyGuard(boolean mightyGuard) {
    this.mightyGuard = mightyGuard;
  }

  public void setMinLevel(int minLevel) {
    this.minLevel = minLevel;
  }

  public void setMultiplier(int multiplier) {
    this.multiplier = multiplier;
  }

  public void setName(String s) {
    name = s;
  }

  public void setPrimary(int primary) {
    this.primary = primary;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public void setSecondary(int secondary) {
    this.secondary = secondary;
  }

  public void setShield(int shield) {
    this.shield = shield;
  }

  public void setSprite(int sprite) {
    this.sprite = sprite;
  }

  public void setSpriteOpacity(int spriteOpacity) {
    this.spriteOpacity = spriteOpacity;
  }

  public void setUnarmedBattleAnimation(int unarmedBattleAnimation) {
    this.unarmedBattleAnimation = unarmedBattleAnimation;
  }

  public void setWeapon(int weapon) {
    this.weapon = weapon;
  }

  public void setWisdom(int[] wisdom) {
    this.wisdom = wisdom.clone();
  }
}
