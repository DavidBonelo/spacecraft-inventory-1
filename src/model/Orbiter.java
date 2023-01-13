package model;

public class Orbiter extends Spacecraft {
    int altitude;

    public Orbiter(String name) {
        super(name);
        type = "orbiter";
    }
}
