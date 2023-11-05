package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  public float credit = 0;

  public VendingMachineImpl() {
    credit = 0;
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  public Drink pressButton (String name) throws NotEnoughMoneyException, UnknownDrinkException{
    if (name != "ScottCola" && name != "KarenTea") {throw new UnknownDrinkException();}

    if (name == "ScottCola"){
      if (credit < .75) {throw new NotEnoughMoneyException();}
      else {
        credit -= .75;
        return new DrinkImpl("ScottCola", true);
      }
    }

    if (name == "KarenTea"){
      if (credit < 1) {throw new NotEnoughMoneyException();}
      else {
        credit -= 1;
        return new DrinkImpl("KarenTea", false);
      }
    }
    else {
      return new DrinkImpl("", false);
    }
  }

  public void insertQuarter() {
    creddit += 0.25;
  }

}
