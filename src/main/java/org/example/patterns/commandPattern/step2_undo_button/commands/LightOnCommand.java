package org.example.patterns.commandPattern.step2_undo_button.commands;

import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.Light;

public class LightOnCommand implements Command {
    Light light ;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
