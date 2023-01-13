package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class Orbiter extends Spacecraft {
    int altitude;
    long orbitTime;
    String target;

    public Orbiter(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int altitude, long orbitTime, String target) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = "orbiter";
        this.altitude = altitude;
        this.orbitTime = orbitTime;
        this.target = target;
    }

    @Override
    public void deactivate() {
        super.deactivate();
        orbitTime = launchDate.until(endOfServiceDate, ChronoUnit.DAYS);
    }

    @Override
    public String toString() {
        return super.toString() + ", altitude = " + altitude + ", orbitTime = " + orbitTime + ", target = " + target;
    }
}
