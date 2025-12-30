package org.example.commandPattern.step2_undo_button.roomsAndAppliances;

public class LivingRoomLight extends Light {

    public LivingRoomLight(String description) {
        super(description);
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
