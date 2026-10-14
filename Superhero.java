public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  public Superhero() {
    this.name = "No name";
    this.costume = "a t-shirt";
    this.weapon = "fist";
    this.life = true;
    this.weaponStrength = 0;
  }

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  public Superhero(String inputName, String inputCostume, String inputWeapon) {
    this.name = inputName;
    this.costume = inputCostume;
    this.weapon = inputWeapon;
    this.life = true;
    this.weaponStrength = (int) (Math.random() * 10 + 1);
  }

  public Superhero(String inputName, String inputCostume, String inputWeapon, int strength) {
    this.name = inputName;
    this.costume = inputCostume;
    this.weapon = inputWeapon;
    this.life = true;
    this.weaponStrength = strength;
  }

  public void loseLife() {
    this.life = false;
  }

  // Part 3
  public int specialAttack(int powerLevel) {
    return this.weaponStrength + (int) (Math.random() * powerLevel + 1);
  }

  public void setWeaponStrength() {
    this.weaponStrength = (int) (Math.random() * 10 + 1);
  }

  public void setWeaponStrength(int weaponStrength){
    this.weaponStrength = weaponStrength;
  }

  // Part 1
  public String toString(){
    String superHeroDetails = "Superhero details \n" + "name: " + name + "\ncostume: " + costume + "\nweapon: " + weapon + "\nlife: " + life + "\nweapon strength: " + weaponStrength + "\n";
    return superHeroDetails;
  }

  // Part 2
  public String getWeapon() {
    return this.weapon;
  }

  public int getWeaponStrength() {
    return this.weaponStrength;
  }

  public String getName() {
    return this.name;
  }
}
