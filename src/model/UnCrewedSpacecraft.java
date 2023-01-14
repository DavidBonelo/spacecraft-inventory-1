package model;

import java.time.LocalDate;

public class UnCrewedSpacecraft extends Spacecraft {
    public int numRoboticArms;
    public String typeSensors;

    public UnCrewedSpacecraft(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int numRoboticArms, String typeSensors) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = SpacecraftType.UNCREWED;
        this.numRoboticArms = numRoboticArms;
        this.typeSensors = typeSensors;
    }

    @Override
    public String toString() {
        return super.toString() + ", numRoboticArms = " + numRoboticArms + ", typeSensors = " + typeSensors;
    }
}
