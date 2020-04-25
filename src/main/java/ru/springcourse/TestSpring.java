package ru.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);


        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();

        context.close();
    }
}


//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());


// получаем bean
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);

// передает в качестве бина id musicPlayer
// Dependency Injection (не внедряем зависимость вручную, а делаем это через Spring)
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        // musicPlayer.playMusicList();
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
