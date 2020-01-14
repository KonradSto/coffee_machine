import java.util.Scanner;

import model.CoffeeMachine;
import service.BeverageMakerImp;
import service.FileReader;
import service.FileReaderImp;
import service.RecipeParser;

public class CoffeeMachineApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReaderImp();
        RecipeParser recipeParser = new RecipeParser();
        CoffeeMachine coffeeMachine = new CoffeeMachine(new BeverageMakerImp(fileReader, recipeParser));
        coffeeMachine.run();

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("status")) {
                coffeeMachine.showStatus();
            }else if (userInput.equalsIgnoreCase("exit")) {
                coffeeMachine.exit();
            } else if (userInput.toLowerCase().contains("make")) {
                coffeeMachine.makeCoffee(userInput.replaceAll("make", ""));
            } else {
                System.out.println("Command not recognized, try again!");
            }
        }
        scanner.close();
        coffeeMachine.exit();
    }
}
