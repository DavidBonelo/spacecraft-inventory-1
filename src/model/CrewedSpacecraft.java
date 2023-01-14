package model;

import java.time.LocalDate;

public class CrewedSpacecraft extends Spacecraft {
    int passengers;

    public CrewedSpacecraft(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int passengers) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = SpacecraftType.CREWED;
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
