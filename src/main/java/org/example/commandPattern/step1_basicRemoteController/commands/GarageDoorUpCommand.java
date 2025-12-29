package org.example.commandPattern.step1_basicRemoteController.commands;

import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
