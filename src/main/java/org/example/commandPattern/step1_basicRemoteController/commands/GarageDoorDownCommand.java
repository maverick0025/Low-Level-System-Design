package org.example.commandPattern.step1_basicRemoteController.commands;

import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.GarageDoor;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
