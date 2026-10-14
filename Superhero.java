public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

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

  // TODO #2: Add missing methods.
  public void loseLife() {
    this.life = false;
  }
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "Superhero details \n" + "name: " + name + "\ncostume: " + costume + "\nweapon: " + weapon + "\nlife: " + life + "\nweapon strength: " + weaponStrength + "\n";
    return superHeroDetails;
  }

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
