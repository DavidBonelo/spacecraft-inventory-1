import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Inventory {
    /**
     * Stores all the spacecrafts in the inventory
     */
    private static final ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

    public static ArrayList<Spacecraft> getSpacecrafts() {
        return spacecrafts;
    }

    public static boolean addItem(Spacecraft spacecraft) {
        return spacecrafts.add(spacecraft); // true if added successfully
    }

    public static boolean removeItem(Spacecraft spacecraft) {
        return spacecrafts.remove(spacecraft);
    }

    public static void updateItem(Spacecraft spacecraft, Spacecraft newSpacecraft) {
        int index = spacecrafts.indexOf(spacecraft);
        spacecrafts.remove(spacecraft);
        spacecrafts.add(index, newSpacecraft);
    }

    //    right now only filters by type TODO: search by characteristics i.e thrust
    public static ArrayList<Spacecraft> searchItem(String type) {
        ArrayList<Spacecraft> filteredSpacecrafts = new ArrayList<>();
        for (Spacecraft spacecraft : spacecrafts) {
            if (Objects.equals(spacecraft.type, type)) filteredSpacecrafts.add(spacecraft);
        }
        return filteredSpacecrafts;
    }

    /**
     * Populates the inventory with mock data
     */
    public static void initData() {
        if (spacecrafts.size() < 12) {
            spacecrafts.add(new LaunchSpacecraft("Falcon Heavy #1", LocalDate.parse("2018-02-06"), LocalDate.parse("2018-02-06"), "Subcooled LOX / Chilled RP-1", 3130000, 3400000, 70, "deploy cargo", 100, 0, 141000));
            spacecrafts.add(new NonTripulatedSpacecraft("Starlink satellite #1", LocalDate.parse("2019-05-24"), null, "krypton", 500, 0, 1, "comms service", 100, 0, 0, "E-band phased array antennas"));
            spacecrafts.add(new TripulatedSpacecraft("SpaceX Dragon 2 #1", LocalDate.parse("2020-05-30"), null, " NTO / MMH propellant", 27600, 90, 8, "human-rated orbital transport", 100, 0, 4));
            spacecrafts.add(new Orbiter("Space Shuttle orbiter #1", LocalDate.parse("1981-04-12"), LocalDate.parse("2011-07-21"), "monomethyl hydrazineand and dinitrogen tetroxide", 240000, 418000, 17, "human-rated orbital transport", 100, 0, 0,0,"Earth orbit"));
            spacecrafts.add(new LaunchSpacecraft("Falcon Heavy #2", LocalDate.parse("2019-04-11"), LocalDate.parse("2019-04-11"), "Subcooled LOX / Chilled RP-1", 3130000, 3400000, 70, "deploy cargo", 100, 0, 141000));
            spacecrafts.add(new NonTripulatedSpacecraft("Starlink satellite #2", LocalDate.parse("2019-05-24"), null, "krypton", 500, 0, 1, "comms service", 100, 0, 0, "E-band phased array antennas"));
            spacecrafts.add(new TripulatedSpacecraft("SpaceX Dragon 2 #2", LocalDate.parse("2021-11-12"), null, " NTO / MMH propellant", 27600, 90, 8, "human-rated orbital transport", 100, 0, 4));
            spacecrafts.add(new Orbiter("Space Shuttle orbiter #2", LocalDate.parse("1981-04-12"), LocalDate.parse("2011-07-21"), "monomethyl hydrazineand and dinitrogen tetroxide", 240000, 418000, 17, "human-rated orbital transport", 100, 0, 0,0,"Earth orbit"));
            spacecrafts.add(new LaunchSpacecraft("Falcon Heavy #3", LocalDate.parse("2019-06-25"), LocalDate.parse("2019-06-25"), "Subcooled LOX / Chilled RP-1", 3130000, 3400000, 70, "deploy cargo", 100, 0, 141000));
            spacecrafts.add(new NonTripulatedSpacecraft("Starlink satellite #3", LocalDate.parse("2019-05-24"), null, "krypton", 500, 0, 1, "comms service", 100, 0, 0, "E-band phased array antennas"));
            spacecrafts.add(new TripulatedSpacecraft("SpaceX Dragon 2 #3", LocalDate.parse("2022-03-30"), null, " NTO / MMH propellant", 27600, 90, 8, "human-rated orbital transport", 100, 0, 4));
            spacecrafts.add(new Orbiter("Space Shuttle orbiter #3", LocalDate.parse("1981-04-12"), LocalDate.parse("2011-07-21"), "monomethyl hydrazineand and dinitrogen tetroxide", 240000, 418000, 17, "human-rated orbital transport", 100, 0, 0,0,"Earth orbit"));

        }
    }
}
