import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spacecraft Inventory");

        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: 1. Show Inventory | 2. Search spacecraft | 3. Create spacecraft | 4. Delete spacecraft | 5. Update spacecraft | 6. Exit");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1 -> showInventory();
                case 2 -> searchSpacecraft();
//                case 3 -> createSpacecraft();
//                case 4 -> deleteSpacecraft();
//                case 5 -> updateSpacecraft();
                case 6 -> exit = true;
                default -> System.out.println("Unknown menu option");
            }
        }
    }

    private static void showInventory() {
        // print inventory // add pagination later
        System.out.println("*inserte el inventario aquí*");
    }

    private static void searchSpacecraft() {
        String[] searchOptions = {"name", "launchDate", "endOfServiceDate", "active", "combustibleType", "weight", "thrust", "height", "speed"};
    }
}