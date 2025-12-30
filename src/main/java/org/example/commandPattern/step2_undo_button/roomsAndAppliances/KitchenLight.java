package org.example.commandPattern.step2_undo_button.roomsAndAppliances;

public class KitchenLight extends Light {

    public KitchenLight(String description) {
        super(description);
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
