package ru.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class RockMusic implements Music {

    List<String> listSongs = Stream.of("Rock1", "Rock2", "Rock3").collect(Collectors.toList());


    @Override
    public List<String> getSongs() {
        return listSongs;
    }
}
