import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.CoffeeMachine;
import model.Status;
import service.FileReaderImp;
import service.RecipeParser;

public class CoffeeMachineApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Status());
        coffeeMachine.showGreeting();

/*        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equalsIgnoreCase("status")) {
                coffeeMachine.showStatus();
            }else if (scanner.nextLine().equalsIgnoreCase("exit")) {
                coffeeMachine.exit();
            }
        }
        scanner.close();
        coffeeMachine.exit();*/

        FileReaderImp fileReaderImp = new FileReaderImp();
        RecipeParser recipeParser = new RecipeParser();
        List<String> recipe = fileReaderImp.readRecipeLinesToList("D:\\Dev\\coffee-machine\\src\\main\\resources\\BlackCoffeeRecipe.txt");
        List<String> step;
        for (String line : recipe) {
            step = recipeParser.parseRecipeLine(line);
            System.out.println(step.get(1));
            try {
                Thread.sleep(Integer.parseInt(step.get(3))*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
