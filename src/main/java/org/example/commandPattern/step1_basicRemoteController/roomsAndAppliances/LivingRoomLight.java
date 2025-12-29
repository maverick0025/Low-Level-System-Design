package org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances;

public class LivingRoomLight extends Light{

    public LivingRoomLight(String description) {
        this.description = description;
    }

    @Override
    public void lightOn() {
        System.out.println("Turning on living room light");
    }

    @Override
    public void lightOff() {
        System.out.println("Turning off living room light");
    }
}
