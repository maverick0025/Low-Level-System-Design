package org.example.patterns.facadePattern;

import org.example.facadePattern.homeTheatre.*;
import org.example.patterns.facadePattern.homeTheatre.*;

public class TestHomeTheatre {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheatreInterface homeTheater =
                new HomeTheatreFacade(amp, popper, player, projector, screen, tuner, lights);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("movie done!");
        homeTheater.endMovie();
    }
}
