package model;

import java.time.LocalDate;

abstract public class Spacecraft {
    public String type;
    public String name;
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

    public Spacecraft(String name, LocalDate launchDate,LocalDate endOfServiceDate, String combustibleType, int weight, int thrust, int height, String objective, int fuelLevel, int speed) {
        this.name = name;
        this.launchDate = launchDate;
        this.endOfServiceDate = endOfServiceDate;
        this.combustibleType = combustibleType;
        this.weight = weight;
        this.thrust = thrust;
        this.height = height;
        this.objective = objective;
        this.fuelLevel = fuelLevel;
        this.speed = speed;

        active = LocalDate.now().isBefore(endOfServiceDate);
    }

    @Override
    public String toString() {
        return "name = " + name + ", launchDate = " + launchDate + ", endOfServiceDate = " + endOfServiceDate + ", combustibleType = " + combustibleType + ", weight = " + weight + ", thrust = " + thrust + ", height = " + height + ", objective = " + objective + ", fuelLevel = " + fuelLevel + ", speed = " + speed;
    }
}

