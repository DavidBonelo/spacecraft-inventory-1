package model;

public class TripulatedSpacecraft extends Spacecraft {
    int Passengers;

    public TripulatedSpacecraft(String name) {
        super(name);
        type = "tripulated";
    }
}
