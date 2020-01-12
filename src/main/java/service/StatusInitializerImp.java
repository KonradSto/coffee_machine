package service;

import java.util.Random;

import model.Status;

public class StatusInitializerImp implements StatusInitializer {

    public StatusInitializerImp() {
    }

    public Status initializeCoffeeMachineStatus() {
        Status status = new Status();
        status.setCoffeeAmount(getRandomValue(1000));
        status.setWaterAmount(getRandomValue(2000));
        status.setMilkAmount(getRandomValue(1000));
        status.setCocoaAmount(getRandomValue(500));
        return status;
    }

    private int getRandomValue(int maxAmount) {
        Random randomValue = new Random();
        return randomValue.nextInt(maxAmount);
    }
}
