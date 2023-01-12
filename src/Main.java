import model.Orbiter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spacecraft Inventory");

        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: 1. Show inventory | 2. Search spacecraft | 3. Exit");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1 -> showInventory();
                case 2 -> searchSpacecraft();
                case 3 -> exit = true;
            }
        }
    }

    private static void showInventory() {

        // print inventory // add pagination later
        System.out.println("*inserte el inventario aquí*");

        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: 1. Create spacecraft | 2. Delete spacecraft | 3. Update spacecraft | 4. Back to main menu");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
//                case 1 -> createSpacecraft();
//                case 2 -> deleteSpacecraft();
//                case 3 -> updateSpacecraft();
                case 4 -> exit = true;
            }

        }
    }

    private static void searchSpacecraft() {
//        Orbiter orbiter = new Orbiter("iss");
        String[] searchOptions = {
                "name",
                "launchDate",
                "endOfServiceDate",
                "active",
                "combustibleType",
                "weight",
                "thrust",
                "height",
                "speed"
        };
    }
}