package org.example.patterns.commandPattern.step2_undo_button.commands;

public interface Command {

    public void execute();
    public void undo();
}
