package com.example.viberadar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.util.Log;

public class MusicManager implements Runnable {

    private AppCompatActivity context;
    private int warmth;

    private boolean running;
    private boolean playing;

    private double interval;
    private int count;

    private MusicPlayer ukulelePlayer;

    private Chord chordLogic;

    private int[] weights;
    private final int[] WEIGHTS_NORMAL = {50, 25, 17};
    private final int[] WEIGHTS_WARM = {10, 25, 57};

    /**
     * Manage playback, manipulate vibes, and keep time.
     */
    public MusicManager(AppCompatActivity context, int warmth) {
        this.context = context;
        this.warmth = warmth;
        chordLogic = new Chord();
        running = false;
        playing = false;

        if (warmth > 0) {
            ukulelePlayer = new MusicPlayer(context, Sounds.MELODIES_WARM);
            weights = WEIGHTS_WARM;
        } else {
            ukulelePlayer = new MusicPlayer(context, Sounds.MELODIES);
            weights = WEIGHTS_NORMAL;
        }
    }

    @Override
    public void run() {
        running = true;
        playing = true;
        int delay = this.warmth > 0 ? 6500 : 8500;
        while (running) {
            if (playing) {
                ukulelePlayer.playChords(chordLogic.next(weights));
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                ukulelePlayer.release();
            }
        }
    }

    /// Starts playback
    public void start() {
        playing = true;
    }

    /// Stops playback
    public void stop() {
        playing = false;
    }

}
