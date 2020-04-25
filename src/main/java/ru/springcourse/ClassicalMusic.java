package ru.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    List<String> listSongs = Stream.of("Classic1", "Classic2", "Classic3").collect(Collectors.toList());

    @Override
    public List<String> getSongs() {
        return listSongs;
    }
}

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

