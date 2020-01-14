package model;

import service.BeverageMaker;
import service.StatusInitializerImp;

public class CoffeeMachine {

    private Status status;
    private BeverageMaker beverageMaker;

    public CoffeeMachine(BeverageMaker beverageMaker) {
        StatusInitializerImp statusInitializerImp = new StatusInitializerImp();
        this.status = statusInitializerImp.initializeCoffeeMachineStatus();
        this.beverageMaker = beverageMaker;
    }

    public void run(){
        System.out.println("HELLO!");
    }

    public void exit(){
        System.out.println("BYE!");
    }

    public void showStatus(){
        System.out.println("Coffee: " + (int)((double)status.getCoffeeAmount()/10) +"%");
        System.out.println("Water: " + (int)((double)status.getWaterAmount()/20) +"%");
        System.out.println("Milk: " + (int)((double)status.getMilkAmount()/10) +"%");
        System.out.println("Cocoa: " + (int)((double)status.getCocoaAmount()/5) +"%");
    }

    public void makeCoffee(String inquiredBeverage){
        beverageMaker.makeCoffee(inquiredBeverage, status);
    }

}
