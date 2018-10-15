public class Man extends Human {

  /**
   * Information about man.
   * @param name name of the man
   * @param age age of the man
   * @param height height of the man
   * @param bodyWeight body weight of the man
   */
  public Man(String name, int age, int height, double bodyWeight) {

    super(name, age, height, bodyWeight);
    bmr = calculateBmr();
  }

  private double calculateBmr() {

    double bmr;
    bmr = 66 + (13.7 * bodyWeight) + (5 * height) - (6.76 * age);
    return bmr;
  }
}
