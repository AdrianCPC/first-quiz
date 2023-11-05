package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int quarters = 0;

  private VendingMachineImpl(){}

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }
  @Override //Insert a quarter in VendingMachine
  public void insertQuarter() {
    quarters++;
  }
  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (quarters < 3) {
      throw new NotEnoughMoneyException();
    }
    if ("ScottCola".equals(name)) {
      quarters -= 3;
      return new Drink() {
        @Override
        public String getName() {
          return "ScottCola";
        }
        @Override
        public boolean isFizzy() {
          return true;
        }
      };
    } else if ("KarenTea".equals(name)) {
      if (quarters < 4) {
        throw new NotEnoughMoneyException();
      }
      quarters -=4;
      return new Drink() {
        @Override
        public String getName() {
          return "KarenTea";
        }
        @Override
        public boolean isFizzy() {
          return false;
        }
      };
    } else {
      throw new UnknownDrinkException();
    }
  }
}
