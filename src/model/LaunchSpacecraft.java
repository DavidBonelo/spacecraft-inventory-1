package model;

public class LaunchSpacecraft extends Spacecraft {
    int payload;

    public LaunchSpacecraft(String name) {
        super(name);
        type = "launch";
    }
}
