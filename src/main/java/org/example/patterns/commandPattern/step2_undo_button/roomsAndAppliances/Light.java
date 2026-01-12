package org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances;

public abstract class Light {
    String description = "Light";

    public Light(String description) {
        this.description = description;
    }

    public abstract void lightOn();
    public abstract void lightOff();
}
