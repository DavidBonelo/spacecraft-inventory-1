package model;

import java.time.LocalDate;

abstract public class Spacecraft {
    String name;
    LocalDate launchDate;
    LocalDate endOfServiceDate;
    boolean active;
    String combustibleType;
    int weight;
    int thrust;
    int height;
    String objective;
    int fuelLevel;
    int speed;

    public void showStatus() {
        System.out.println(this);
    }

    public void deactivate() {
        active = false;
        endOfServiceDate = LocalDate.now();
    }

}

