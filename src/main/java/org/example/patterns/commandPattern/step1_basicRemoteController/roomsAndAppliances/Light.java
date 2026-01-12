package org.example.patterns.commandPattern.step1_basicRemoteController.roomsAndAppliances;

public abstract class Light {
    String description = "Light";

    public Light(String description) {
        this.description = description;
    }

    public abstract void lightOn();
    public abstract void lightOff();
}
