package ru.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicStyle musicStyle) {
        Random random = new Random();
        if (musicStyle.name().equals("CLASSICAL")) {
            System.out.println("Playing " + music2.getSongs().get(random.nextInt(music2.getSongs().size())));
        } else System.out.println("Playing " + music1.getSongs().get(random.nextInt(music1.getSongs().size())));

    }
}
