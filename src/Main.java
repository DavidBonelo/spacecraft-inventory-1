import factory.SpacecraftFactory;
import model.Spacecraft;
import model.SpacecraftType;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spacecraft Inventory");

        Inventory.initData();

        boolean exit = false;
        while (!exit) {
            int menuChoice = menu("Menu: 1. Show Inventory | 2. Search spacecraft | 3. Create spacecraft | 4. Delete spacecraft | 5. Update spacecraft | 0. Exit");
            switch (menuChoice) {
                case 1 -> showInventory(Inventory.getSpacecrafts());
                case 2 -> searchSpacecraft();
                case 3 -> createSpacecraft();
                case 4 -> deleteSpacecraft();
                case 5 -> updateSpacecraft();
                case 0 -> exit = true;
                default -> System.out.println("Unknown menu option");
            }
        }
    }

    private static void showInventory(ArrayList<Spacecraft> spacecrafts) {
        // TODO: add pagination
        System.out.println("SPACECRAFT INVENTORY:");
        for (int i = 0; i < spacecrafts.size(); i++) {
            Spacecraft sc = spacecrafts.get(i);
            System.out.println(i + 1 + " | " + sc); // i+1 to start with 1 instead of 0
        }
        System.out.println();
    }

    private static void searchSpacecraft() {
//        String[] searchOptions = {"name", "launchDate", "endOfServiceDate", "active", "combustibleType", "weight", "thrust", "height", "speed"};
        int menuChoice = menu("What type of spacecraft do you want to search? : 1. Launch | 2. UnCrewed | 3. Crewed | 4. Orbiter");
        switch (menuChoice) {
            case 1 -> showInventory(Inventory.searchItem(SpacecraftType.LAUNCH));
            case 2 -> showInventory(Inventory.searchItem(SpacecraftType.UNCREWED));
            case 3 -> showInventory(Inventory.searchItem(SpacecraftType.CREWED));
            case 4 -> showInventory(Inventory.searchItem(SpacecraftType.ORBITER));
        }
    }

    private static void createSpacecraft() {
        int menuChoice = menu("What type of spacecraft do you want to register? : 1. Launch | 2. UnCrewed | 3. Crewed | 4. Orbiter ");
        switch (menuChoice) {
            case 1 -> Inventory.addItem(SpacecraftFactory.createSpacecraft(SpacecraftType.LAUNCH));
            case 2 -> Inventory.addItem(SpacecraftFactory.createSpacecraft(SpacecraftType.UNCREWED));
            case 3 -> Inventory.addItem(SpacecraftFactory.createSpacecraft(SpacecraftType.CREWED));
            case 4 -> Inventory.addItem(SpacecraftFactory.createSpacecraft(SpacecraftType.ORBITER));
        }
    }

    private static void deleteSpacecraft() {
        int deleteIndex = menu("Type the number of the spacecraft you want to delete? : ") - 1;
        Inventory.getSpacecrafts().remove(deleteIndex);
    }

    private static void updateSpacecraft() {
        int updateIndex = menu("Type the number of the spacecraft you want to update? : ") - 1;
        Spacecraft newSpacecraft = SpacecraftFactory.createSpacecraft(Inventory.getSpacecrafts().get(updateIndex).type);
        Inventory.updateItem(Inventory.getSpacecrafts().get(updateIndex), newSpacecraft);
    }

    private static int menu(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}