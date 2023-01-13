import model.Spacecraft;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spacecraft Inventory");

        Inventory.initData();

        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: 1. Show Inventory | 2. Search spacecraft | 3. Create spacecraft | 4. Delete spacecraft | 5. Update spacecraft | 0. Exit");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1 -> showInventory(Inventory.getSpacecrafts());
                case 2 -> searchSpacecraft();
//                case 3 -> createSpacecraft();
//                case 4 -> deleteSpacecraft();
//                case 5 -> updateSpacecraft();
                case 0 -> exit = true;
                default -> System.out.println("Unknown menu option");
            }
        }
    }

    private static void showInventory(ArrayList<Spacecraft> spacecrafts) {
        // print inventory // add pagination later
        System.out.println("*inserte el inventario aquí*");
        for (int i = 0; i < spacecrafts.size(); i++) {
            Spacecraft sc = spacecrafts.get(i);
            System.out.println(i + " | name: " + sc.name + " | type: " + sc.type);
        }
    }

    private static void searchSpacecraft() {
//        String[] searchOptions = {"name", "launchDate", "endOfServiceDate", "active", "combustibleType", "weight", "thrust", "height", "speed"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of spacecraft do you want to search? : 1. Launch | 2. NonTripulated | 3. Tripulated | 4. Orbiter | 5. Probe");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1 -> showInventory(Inventory.searchItem("launch"));
            case 2 -> showInventory(Inventory.searchItem("nontripulated"));
            case 3 -> showInventory(Inventory.searchItem("tripulated"));
            case 4 -> showInventory(Inventory.searchItem("orbiter"));
            case 5 -> showInventory(Inventory.searchItem("probe"));
        }
    }
}