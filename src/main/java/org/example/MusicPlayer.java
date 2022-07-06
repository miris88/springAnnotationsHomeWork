package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(Music classicalMusic, Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(MusicGenre musicGenre) {
        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println("Playing: " + classicalMusic.getSong());
        } else if (musicGenre == MusicGenre.ROCK) {
            System.out.println("Playing: " + rockMusic.getSong());
        }
    }
}
