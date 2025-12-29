package org.example.commandPattern.step1_basicRemoteController;

import org.example.commandPattern.step1_basicRemoteController.commands.LightOffCommand;
import org.example.commandPattern.step1_basicRemoteController.commands.LightOnCommand;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.KitchenLight;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.LivingRoomLight;

public class TestRemoteControl {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        LivingRoomLight livingRoomLight = new LivingRoomLight("Living room light");
        KitchenLight kitchenLight = new KitchenLight("Kitchen light");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);


        remoteControl.setSlots(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setSlots(1, kitchenLightOnCommand, kitchenLightOffCommand);


        //execution
        System.out.println("Living room lights");
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);

        System.out.println("kitchen lights ");
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
    }
}

