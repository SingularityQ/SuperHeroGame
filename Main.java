public class Main {

  public static String superheroFight(Superhero superhero1, Superhero superhero2) {

    if (superhero2.getWeaponStrength() > superhero1.getWeaponStrength()) {
      return superhero2.getName() + " wins using (the) " + superhero2.getWeapon() + "!";
    } else if (superhero2.getWeaponStrength() < superhero1.getWeaponStrength()) {
      return superhero1.getName() + " wins using (the) " + superhero1.getWeapon() + "!";
    } else {
      return "The fight was a draw.";
    }

  }
  
  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web", 200);
    System.out.println(spiderman1.toString());
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength", 100);
    spiderman1.loseLife();
    System.out.println(batman1.toString());
    System.out.println(superheroFight(spiderman1, batman1));

  }

}
