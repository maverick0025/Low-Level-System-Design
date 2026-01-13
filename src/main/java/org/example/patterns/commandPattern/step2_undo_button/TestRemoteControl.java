package org.example.patterns.commandPattern.step2_undo_button;

import org.example.patterns.commandPattern.step2_undo_button.commands.*;
import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.CeilingFan;
import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.GarageDoor;
import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.KitchenLight;
import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.LivingRoomLight;

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

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);

        remoteControl.setSlots(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setSlots(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setSlots(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setSlots(3, garageDoorUp, garageDoorDown);
        remoteControl.setSlots(4, ceilingFanMedium, ceilingFanHigh);

        //there are still more slots empty

        //execution
        System.out.println("Living room lights");
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);

        System.out.println("kitchen lights ");
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);

        remoteControl.undoButtonPushed();

        remoteControl.onButtonPushed(4);
        remoteControl.undoButtonPushed();
    }
}

