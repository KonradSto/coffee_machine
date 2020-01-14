package service;

import model.Status;

public interface BeverageMaker {

    void makeCoffee(String beverage, Status currentStatus);
}
