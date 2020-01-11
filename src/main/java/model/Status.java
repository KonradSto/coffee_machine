package model;

public class Status {

    private int coffeeAmount;
    private int waterAmount;
    private int milkAmount;
    private int cocoaAmount;

    public Status(int coffeeAmount, int waterAmount, int milkAmount, int cocoaAmount) {
        this.coffeeAmount = coffeeAmount;
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
        this.cocoaAmount = cocoaAmount;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }

    public int getCocoaAmount() {
        return cocoaAmount;
    }

    public void setCocoaAmount(int cocoaAmount) {
        this.cocoaAmount = cocoaAmount;
    }
}
