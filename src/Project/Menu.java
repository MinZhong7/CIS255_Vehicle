import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Select Vehicles");
            System.out.println("2. Show Vehicles");
            System.out.println("3. Save to File");
            System.out.println("4. Exit");

            int choice = getUserChoice(scanner, 4);

            switch (choice) {
                case 1:
                    selectVehiclesMenu(scanner);
                    break;
                case 2:
                    showVehiclesMenu();
                    break;
                case 3:
                    saveToFileMenu();
                    break;
                case 4:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }

    private static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= maxChoice) {
                    isValid = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + maxChoice);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return choice;
    }

    private static void selectVehiclesMenu(Scanner scanner) {
        
        System.out.println("Select Vehicles Menu");
        System.out.println("1. Select By Make");
        System.out.println("2. Select By Model");
        System.out.println("3. Select By Year");
        System.out.println("4. Back to Menu");
        
        int choice = getUserChoice(scanner, 4);

        switch (choice) {
            case 1:
                selectByMake();
                break;
            case 2:
                selectByModel();
                break;
            case 3:
                selectByYear();
                break;
            case 4:
                System.out.println("Back to Menu");
                break;
            default:
                System.out.println("Invalid. Please try again.");
        }
    }

    private static void selectByMake() {
       
        System.out.println("Select By Make:");
        System.out.println("1. Chevrolet");
        System.out.println("2. Ford");
        System.out.println("3. Honda");
        System.out.println("4. Hyundai");
        System.out.println("5. Toyota");
        
        int choice = getUserChoice(scanner, 6);

        switch (choice) {
            case 1:
                filterAndDisplayVehicles("Chevrolet");
                break;
            case 2:
                filterAndDisplayVehicles("Ford");
                break;
            case 3:
                filterAndDisplayVehicles("Honda");
                break;
            case 4:
                filterAndDisplayVehicles("Hyundai");
                break;
            case 5:
                filterAndDisplayVehicles("Toyota");
                break;
            case 6:
                System.out.println("Back to Last Menu");
                break;
            default:
                System.out.println("Invalid. Please try again.");
        }
    }
        

    private static void showVehiclesMenu() {
      
        System.out.println("Showing Vehicles Menu");
    }

    private static void saveToFileMenu() {
        
        System.out.println("Saving to File Menu");
    }
}
