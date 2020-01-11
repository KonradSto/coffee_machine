package model;

public class CoffeeMachine {

    private Status status;


    public void initializeCoffeeMachineStatus(){

    }

    public void showStatus(){
        System.out.println("Coffee: " + status.getCoffeeAmount());
        System.out.println("Water: " + status.getWaterAmount());
        System.out.println("Milk: " + status.getMilkAmount());
        System.out.println("Cocoa: " + status.getCocoaAmount());
    }
    
}
