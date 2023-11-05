package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine, Drink {

  private int insertedQuarters = 0;
  private map<String, CreateDrink> drinks;


  public static VendingMachine getInstance() {
    // Fix me!
    return new VendingMachineImpl();
  }

  public VendingMachineImp(){

    drinks = new HashMap<>();

    drinks.put("ScottCola", new CreateDrink("ScottCola", 3, true));
    drinks.put("KarenTea", new CreateDrink("KarenTea",4,false));

  }

  @Override
  public void insertQuarter(){
    insertedQuarters++
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException{
    CreateDrink drink = drinks.get(name);

    if(!drinks.containsKey(name)){
      throw new UnknownDrinkException();
    }

    if(insertedQuarters < drink.getPrice(name)){
      throw new NotEnoughMoneyException();
    }
    
    insertedQuarters -= drink.getPrice();

    return drink

  }

}
