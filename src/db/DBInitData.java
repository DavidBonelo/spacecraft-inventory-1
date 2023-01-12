package db;

import factory.SpacecraftFactory;
import model.Spacecraft;

public class DBInitData {
    public static void populateDB() {
        String[][] spacecraftsData = {
                {"orbiter", "Mars orbiter"},
                {"orbiter", "Moon orbiter"},
                {"launch", "Falcon Heavy"},

        };
        for (String[] spacecraftdata : spacecraftsData) {
            Spacecraft spacecraft = SpacecraftFactory.getSpacecraft("orbiter", "Mars orbiter");
//            db.addElement(spacecraft);
        }
    }

}
