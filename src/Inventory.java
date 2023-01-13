import model.Spacecraft;

import java.util.ArrayList;
import java.util.Objects;

public class Inventory {
    private static final ArrayList<Spacecraft> spacecrafts = new ArrayList<Spacecraft>();

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
        ArrayList<Spacecraft> filteredSpacecrafts = new ArrayList<Spacecraft>();
        for (Spacecraft spacecraft : spacecrafts) {
            if (Objects.equals(spacecraft.type, type)) filteredSpacecrafts.add(spacecraft);
        }
        return filteredSpacecrafts;
    }
}
