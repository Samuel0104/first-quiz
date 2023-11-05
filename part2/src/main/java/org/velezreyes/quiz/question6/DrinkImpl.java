package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {

  public String name = "";
  public boolean fizzy = false;

  public DrinkImpl(String soda_name, boolean fizz) {
    name = soda_name;
    fizzy = fizz;
  }

  public static Drink getInstance() {
    return new DrinkImpl("", false);
  }

  public static Drink getInstance() {
    return new DrinkImpl("", false);
  }

  public String getName() {
    return name;
  }

  public boolean isFizzy() {
    return fizzy;
  }

}
