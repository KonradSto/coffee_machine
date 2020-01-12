package model;

import service.BeverageMaker;
import service.StatusInitializerImp;

public class CoffeeMachine {

    private Status status;
    private BeverageMaker beverageMaker;

    public CoffeeMachine(Status status) {
        StatusInitializerImp statusInitializerImp = new StatusInitializerImp();
        this.status = statusInitializerImp.initializeCoffeeMachineStatus();
    }

    public void showGreeting(){
        System.out.println("Hello!");
    }

    public void exit(){
        System.out.println("Bye!");
    }

    public void showStatus(){
        System.out.println("Coffee: " + (int)((double)status.getCoffeeAmount()/10) +"%");
        System.out.println("Water: " + (int)((double)status.getWaterAmount()/20) +"%");
        System.out.println("Milk: " + (int)((double)status.getMilkAmount()/10) +"%");
        System.out.println("Cocoa: " + (int)((double)status.getCocoaAmount()/5) +"%");
    }

    public void makecoffee(){

    }

}
