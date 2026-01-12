package org.example.patterns.commandPattern.step2_undo_button;

import org.example.patterns.commandPattern.step2_undo_button.commands.Command;
import org.example.patterns.commandPattern.step2_undo_button.commands.noCommand;

public class RemoteControl {

    Command[] onSlots = new Command[8];
    Command[] offSlots = new Command[8];
    Command undoCommand;

    public RemoteControl() {
        Command noCommand = new noCommand();
        for(int i=0; i< 8; i++){
            onSlots[i] = noCommand;
            offSlots[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setSlots(int slotId, Command command1, Command command2) {
        onSlots[slotId] = command1;
        offSlots[slotId] = command2;
    }

    public void onButtonPushed(int slot){
        onSlots[slot].execute();
        undoCommand = onSlots[slot];
    }

    public void offButtonPushed(int slot){
        offSlots[slot].execute();
        undoCommand = offSlots[slot];
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onSlots.length; i++) {
            stringBuff.append("[slot " + i + "] " + onSlots[i].getClass().getName()
                    + "    " + offSlots[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
