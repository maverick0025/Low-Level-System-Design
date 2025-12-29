package org.example.commandPattern.step1_basicRemoteController.commands;

import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.Light;

public class LightOffCommand implements Command{

    Light light ;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
