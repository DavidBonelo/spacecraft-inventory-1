package model;

import java.time.LocalDate;

public class LaunchSpacecraft extends Spacecraft {
    int payload;

    public LaunchSpacecraft(String name, LocalDate launchDate, LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed, int payload) {
        super(name, launchDate, endOfServiceDate, combustibleType, weight, thrust, height, objective, fuelLevel, speed);
        type = SpacecraftType.LAUNCH;
        this.payload = payload;
    }

    public void Launch() {
        System.out.println("3. 2... Ignition.. Liftoff!! *clap* *clap*");
        launchDate = LocalDate.now();
    }

    public void releasePayload() {
        System.out.println("Payload deployed!");
        payload = 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", payload = " + payload;
    }
}
