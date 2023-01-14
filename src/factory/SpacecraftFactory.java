package factory;

import model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class SpacecraftFactory {
    /**
     * Class that handles the creation of Spacecrafts child clases
     * @param type the type uses the enumn SpacecraftType.
     */
    public static Spacecraft createSpacecraft(SpacecraftType type) {
//        TODO: validate inputs
//        Common fields of the Spacecraft class
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

//        particular fields of the Spacecraft child classes and creation
        switch (type) {
            case LAUNCH -> {
                int payload = Integer.parseInt(read("Insert the payload of the spacecraft (number): "));
                return new LaunchSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, payload);
            }
            case UNCREWED -> {
                int numRoboticArms = Integer.parseInt(read("Insert the numRoboticArms of the spacecraft (number): "));
                String typeSensors = read("Insert the type of sensors in the spacecraft : ");
                return new UnCrewedSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, numRoboticArms, typeSensors);
            }
            case CREWED -> {
                int passengers = Integer.parseInt(read("Insert the number of passengers of the spacecraft (number): "));
                return new CrewedSpacecraft(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed, passengers);
            }
            case ORBITER -> {
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

    /**
     * Simple method to show a prompt and read a string from std
     * @param prompt a string to show in sout
     * @return a String read from stdin
     */
    private static String read(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
