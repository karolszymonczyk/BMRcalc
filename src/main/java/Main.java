public class Main {

  /**
   * Calculating BMR.
   */
  public static void main(String[] args) {

    Woman marta = new Woman("Marta", 18,165, 55);
    Woman kasia = new Woman("Kasia", 20, 174, 58);
    Woman kornelia = new Woman("Kornelia", 22, 168, 44);

    Man szymon = new Man("Szymon", 20, 193, 91);
    Man bartek = new Man("Bartek", 21, 179, 64);

    Human []people = {marta, kasia, kornelia, szymon, bartek};

    for (Human person : people) {
      System.out.println(person.name + "\'s BMR is: " + person.bmr);
    }
  }
}
