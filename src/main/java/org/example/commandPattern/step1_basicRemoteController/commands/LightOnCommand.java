package org.example.commandPattern.step1_basicRemoteController.commands;

import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.KitchenLight;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.Light;

public class LightOnCommand implements Command{
    Light light ;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
