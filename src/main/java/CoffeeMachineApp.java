import java.util.Scanner;

import model.CoffeeMachine;
import model.Status;

public class CoffeeMachineApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Status());
        coffeeMachine.showGreeting();

        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equalsIgnoreCase("status")) {
                coffeeMachine.showStatus();
            }else if (scanner.nextLine().equalsIgnoreCase("exit")) {
                coffeeMachine.exit();
            }
        }
        scanner.close();
        coffeeMachine.exit();
    }
}
