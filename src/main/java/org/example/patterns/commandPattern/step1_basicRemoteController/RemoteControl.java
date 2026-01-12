package org.example.patterns.commandPattern.step1_basicRemoteController;

import org.example.patterns.commandPattern.step1_basicRemoteController.commands.Command;

public class RemoteControl {

    Command[] onSlots = new Command[5];
    Command[] offSlots = new Command[5];

    public void setSlots(int slotId, Command command1, Command command2) {
        onSlots[slotId] = command1;
        offSlots[slotId] = command2;
    }

    public void onButtonPushed(int slot){
        onSlots[slot].execute();
    }

    public void offButtonPushed(int slot){
        offSlots[slot].execute();
    }
}
