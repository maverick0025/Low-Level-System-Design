package org.example.patterns.commandPattern.step2_undo_button.commands;

import org.example.patterns.commandPattern.step2_undo_button.roomsAndAppliances.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 	StereoOnWithCDCommand stereoOn;
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
		stereoOn = new StereoOnWithCDCommand(stereo);
	}
 
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereoOn.execute();
	}
}
