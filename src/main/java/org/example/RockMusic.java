package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Basket Case");
        rockSongs.add("Animal I Have Become");
        rockSongs.add("Numb");
    }

    @Override
    public String getSong() {
        return rockSongs.get(new Random().nextInt(3));
    }
}
