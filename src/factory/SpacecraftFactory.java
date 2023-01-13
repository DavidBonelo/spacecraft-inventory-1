package factory;

import model.*;

public class SpacecraftFactory {
    /**
     * @param type the types are: "launch", "notripulated", "tripulated", "orbiter".
     */
    public static Spacecraft createSpacecraft(String type, String name) {
        type = type.toLowerCase();
        Spacecraft spacecraft;
        switch (type) {
            case "launch" -> {
                return new LaunchSpacecraft(type);
            }
            case "notripulated" -> {
                return new NonTripulatedSpacecraft(type);
            }
            case "tripulated" -> {
                return new TripulatedSpacecraft(type);
            }
            case "orbiter" -> {
                return new Orbiter(name);
            }
            default -> {
                return null;
            }
        }
    }
}
