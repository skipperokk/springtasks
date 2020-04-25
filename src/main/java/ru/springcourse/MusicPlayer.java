package ru.springcourse;

public class MusicPlayer {

//    private List<Music> musicList = new ArrayList<>();
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }



//    public MusicPlayer() {
//
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
