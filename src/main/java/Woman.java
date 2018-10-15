public class Woman extends Human {

  /**
   * Information about woman.
   * @param name name of the woman
   * @param age age of the woman
   * @param height height of the woman
   * @param bodyWeight body weight of the woman
   */
  public Woman(String name, int age, int height, double bodyWeight) {

    super(name, age, height, bodyWeight);
    bmr = calculateBmr();
  }

  private double calculateBmr() {

    double bmr;
    bmr = 655 + (9.6 * bodyWeight) + (1.8 * height) - (4.7 * age);
    return bmr;
  }
}
