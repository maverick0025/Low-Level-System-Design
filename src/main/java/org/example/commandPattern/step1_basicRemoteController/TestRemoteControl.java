package org.example.commandPattern.step1_basicRemoteController;

import org.example.commandPattern.step1_basicRemoteController.commands.*;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.CeilingFan;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.GarageDoor;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.KitchenLight;
import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.LivingRoomLight;

public class TestRemoteControl {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        LivingRoomLight livingRoomLight = new LivingRoomLight("Living room light");
        KitchenLight kitchenLight = new KitchenLight("Kitchen light");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        remoteControl.setSlots(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setSlots(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setSlots(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setSlots(3, garageDoorUp, garageDoorDown);

        //there is still one more slot empty

        //execution
        System.out.println("Living room lights");
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);

        System.out.println("kitchen lights ");
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);


    }
}

