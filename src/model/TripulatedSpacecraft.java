package model;

import java.time.LocalDate;

public class TripulatedSpacecraft extends Spacecraft {
    int passengers;

    public TripulatedSpacecraft(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int passengers) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = "tripulated";
        this.passengers = passengers;
    }

    public void eject() {
        System.out.println("Eject!");
    }

    @Override
    public String toString() {
        return super.toString() + ", passengers = " + passengers;
    }
}
