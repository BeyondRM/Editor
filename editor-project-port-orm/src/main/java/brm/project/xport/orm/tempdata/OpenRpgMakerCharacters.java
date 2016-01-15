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
  // conditionResists:
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

  private void parse() {
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

  public void setAccessory(int i) {
    accessory = i;
  }

  public void setAgility(int[] is) {
    agility = is.clone();
  }

  public void setAiControlled(boolean b) {
    aiControlled = b;
  }

  public void setAiLevel(int i) {
    aiLevel = i;
  }

  public void setArmor(int i) {
    armor = i;
  }

  public void setAtack(int[] is) {
    atack = is.clone();
  }

  public void setAttributeResists(String s) {
    attributeResists = s;
  }

  public void setClassID(int i) {
    classID = i;
  }

  public void setCommand1(int i) {
    command1 = i;
  }

  public void setCommand2(int i) {
    command2 = i;
  }

  public void setCommand3(int i) {
    command3 = i;
  }

  public void setCommand4(int i) {
    command4 = i;
  }

  public void setCommand5(int i) {
    command5 = i;
  }

  public void setCommand6(int i) {
    command6 = i;
  }

  public void setConditionResists(String s) {
    conditionResists = s;
  }

  public void setDefense(int[] is) {
    defense = is.clone();
  }

  public void setDuelWielding(boolean b) {
    duelWielding = b;
  }

  public void setEquipmentLocked(boolean b) {
    equipmentLocked = b;
  }

  public void setFaceGraphic(int i) {
    faceGraphic = i;
  }

  public void setHasCriticalHits(boolean b) {
    hasCriticalHits = b;
  }

  public void setHelmet(int i) {
    helmet = i;
  }

  public void setMaxHP(int[] is) {
    maxHP = is.clone();
  }

  public void setMaxLevel(int i) {
    maxLevel = i;
  }

  public void setMaxMP(int[] is) {
    maxMP = is.clone();
  }

  public void setMightyGuard(boolean b) {
    mightyGuard = b;
  }

  public void setMinLevel(int i) {
    minLevel = i;
  }

  public void setMultiplier(int i) {
    multiplier = i;
  }

  public void setName(String s) {
    name = s;
  }

  public void setPrimary(int i) {
    primary = i;
  }

  public void setRate(int i) {
    rate = i;
  }

  public void setSecondary(int i) {
    secondary = i;
  }

  public void setShield(int i) {
    shield = i;
  }

  public void setSprite(int i) {
    sprite = i;
  }

  public void setSpriteOpacity(int i) {
    spriteOpacity = i;
  }

  public void setUnarmedBattleAnimation(int i) {
    unarmedBattleAnimation = i;
  }

  public void setWeapon(int i) {
    weapon = i;
  }

  public void setWisdom(int[] is) {
    wisdom = is.clone();
  }
}
