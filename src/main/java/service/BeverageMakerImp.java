package service;

import java.util.List;

import model.Status;

public class BeverageMakerImp implements BeverageMaker {

    private FileReader fileReaderImp;
    private RecipeParser recipeParser;

    public BeverageMakerImp(FileReader fileReaderImp, RecipeParser recipeParser) {
        this.fileReaderImp = fileReaderImp;
        this.recipeParser = recipeParser;
    }

    @Override
    public void makeCoffee(String beverage, Status currentStatus) {
        List<String> recipe = fileReaderImp.readRecipeLinesToList("src\\main\\resources\\" + beverage.replaceAll("\\s","")+ ".txt");
        List<String> step;
        if (recipe != null) {
            for (String line : recipe) {
                step = recipeParser.parseRecipeLine(line);
                drawIngredient(step.get(1), step.get(2), Integer.parseInt(step.get(3)), currentStatus);
                System.out.println(step.get(1) + " " + step.get(2));
                try {
                    Thread.sleep(Integer.parseInt(step.get(4)) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("ENJOY!");
        }
    }

    private void drawIngredient(String action, String ingredient, int quantity, Status status){
        if (action.equals("GRINDING") || action.equals("HEATING")){
            switch (ingredient) {
                case "COFFEE":
                    status.setCoffeeAmount(status.getCoffeeAmount() - quantity);
                    break;
                case "MILK":
                    status.setMilkAmount(status.getMilkAmount() - quantity);
                    break;
                case "WATER":
                    status.setWaterAmount(status.getWaterAmount() - quantity);
                    break;
                case "COCOA":
                    status.setCocoaAmount(status.getCocoaAmount() - quantity);
            }
        }
    }
}
