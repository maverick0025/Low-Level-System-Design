package org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances;

public class KitchenLight extends Light{

    public KitchenLight(String description) {
        this.description = description;
    }

    @Override
    public void lightOn() {
        System.out.println("Turning on kitchen light");
    }

    @Override
    public void lightOff() {
        System.out.println("Turning off kitchen light");
    }
}
