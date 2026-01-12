package org.example.patterns.commandPattern.step2_undo_button.commands;

import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.Light;

public class LightOffCommand implements Command {

    Light light ;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
