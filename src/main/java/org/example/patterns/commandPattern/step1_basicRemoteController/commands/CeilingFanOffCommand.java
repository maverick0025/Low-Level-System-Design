package org.example.patterns.commandPattern.step1_basicRemoteController.commands;

import org.example.patterns.commandPattern.step1_basicRemoteController.roomsAndAppliances.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
