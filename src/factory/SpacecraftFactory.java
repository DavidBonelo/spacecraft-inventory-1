package factory;

import model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class SpacecraftFactory {
    /**
     * @param type the types are: "launch", "notripulated", "tripulated", "orbiter".
     */
    public static Spacecraft createSpacecraft(String type) {
        type = type.toLowerCase();
        String name = read("Insert the name of the spacecraft: ");
        LocalDate launchDate = LocalDate.parse(read("Insert the launch date of the spacecraft (YYYY-MM-DD): "));
        LocalDate endOfServiceDate = LocalDate.parse(read("Insert the end of service date of the spacecraft (YYYY-MM-DD): "));
        String combustibleType = read("Insert the combustible type of the spacecraft: ");
        int weight = Integer.parseInt(read("Insert the weight of the spacecraft (number): "));
        int thrust = Integer.parseInt(read("Insert the thrust of the spacecraft (number): "));
        int height = Integer.parseInt(read("Insert the height of the spacecraft (number): "));
        String objective = read("Insert the objective of the spacecraft: ");
        int fuelLevel = Integer.parseInt(read("Insert the fuelLevel of the spacecraft (number): "));
        int speed = Integer.parseInt(read("Insert the speed of the spacecraft (number) : "));

        switch (type) {
            case "launch" -> {
                int payload = Integer.parseInt(read("Insert the payload of the spacecraft (number): "));
                return new LaunchSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, payload);
            }
            case "notripulated" -> {
                int numRoboticArms = Integer.parseInt(read("Insert the numRoboticArms of the spacecraft (number): "));
                String typeSensors = read("Insert the type of sensors in the spacecraft : ");
                return new NonTripulatedSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, numRoboticArms, typeSensors);
            }
            case "tripulated" -> {
                int passengers = Integer.parseInt(read("Insert the number of passengers of the spacecraft (number): "));
                return new TripulatedSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, passengers);
            }
            case "orbiter" -> {
                int altitude = Integer.parseInt(read("Insert the altitude of the spacecraft (number): "));
                long orbitTime = Long.parseLong(read("Insert the orbitTime of the spacecraft (number): "));
                String target = read("Insert the target of the spacecraft: ");
                return new Orbiter(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, altitude, orbitTime, target);
            }
            default -> {
                return null;
            }
        }
    }

    private static String read(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
