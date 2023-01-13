package model;

import java.time.LocalDate;

public class NonTripulatedSpacecraft extends Spacecraft {
    public int numRoboticArms;
    public String typeSensors;

    public NonTripulatedSpacecraft(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int numRoboticArms, String typeSensors) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = "nontripulated";
        this.numRoboticArms = numRoboticArms;
        this.typeSensors = typeSensors;
    }

    @Override
    public String toString() {
        return super.toString() + ", numRoboticArms = " + numRoboticArms + ", typesensors = " + typeSensors;
    }
}
