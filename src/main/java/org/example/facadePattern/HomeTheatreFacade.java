package org.example.facadePattern;

import org.example.facadePattern.homeTheatre.*;

public class HomeTheatreFacade implements HomeTheatreInterface{
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;


    public HomeTheatreFacade(Amplifier amplifier,
                             PopcornPopper popcornPopper,
                             StreamingPlayer streamingPlayer,
                             Projector projector,
                             Screen screen,
                             Tuner tuner,
                             TheaterLights theaterLights) {
        this.amp = amplifier;
        this.popper = popcornPopper;
        this.player = streamingPlayer;
        this.projector = projector;
        this.screen = screen;
        this.tuner = tuner;
        this.lights = theaterLights;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    @Override
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    @Override
    public void listenToRadio(float frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    @Override
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}