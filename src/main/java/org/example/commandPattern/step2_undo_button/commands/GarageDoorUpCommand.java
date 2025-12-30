package org.example.commandPattern.step2_undo_button.commands;

import org.example.commandPattern.step2_undo_button.roomsAndAppliances.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}
}
