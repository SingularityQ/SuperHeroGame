public class Main {

  // Part 2
  public static String superheroFight(Superhero superhero1, Superhero superhero2) {

    if (superhero2.getWeaponStrength() > superhero1.getWeaponStrength()) {
      return superhero2.getName() + " wins using (the) " + superhero2.getWeapon() + "!\n";
    } else if (superhero2.getWeaponStrength() < superhero1.getWeaponStrength()) {
      return superhero1.getName() + " wins using (the) " + superhero1.getWeapon() + "!\n";
    } else {
      return "The fight was a draw.\n";
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

    // Part 2
    System.out.println(superheroFight(spiderman1, batman1));

    //Part 3
    Superhero hiGuy = new Superhero();
    Superhero batman = new Superhero("Batman", "Batsuit", "Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Redsuit", "Superweb");
    System.out.println(batman.toString());
    System.out.println(spiderman.toString());
    System.out.println("The Green Goblin shows up...\n");
    spiderman.loseLife();
    System.out.println(spiderman.toString());
    
    System.out.println(batman.getName() + " uses his special attack and deals " + batman.specialAttack(4) + " damage.");
    System.out.println(hiGuy.getName() +  " uses his special attack and deals " + hiGuy.specialAttack(9001) + " damage.");
  }

}
