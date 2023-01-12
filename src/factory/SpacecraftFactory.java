package factory;

import model.*;

public class SpacecraftFactory {
    /**
     * @param type the types are: "launch", "notripulated", "tripulated", "orbiter".
     */
    public static Spacecraft getSpacecraft(String type, String name) {
        type = type.toLowerCase();
        Spacecraft spacecraft;
        switch (type) {
            case "launch" -> {
                return new LaunchSpacecraft();
            }
            case "notripulated" -> {
                return new NonTripulatedSpacecraft();
            }
            case "tripulated" -> {
                return new TripulatedSpacecraft();
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
