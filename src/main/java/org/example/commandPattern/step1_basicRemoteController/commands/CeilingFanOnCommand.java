package org.example.commandPattern.step1_basicRemoteController.commands;

import org.example.commandPattern.step1_basicRemoteController.roomsAndAppliances.CeilingFan;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
