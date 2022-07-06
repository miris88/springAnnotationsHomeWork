package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalSongs = new ArrayList<>(3);

    {
        classicalSongs.add("Symphony No. 3 in F Op. 90: III. Poco allegretto");
        classicalSongs.add("Radetzky Marsch Op. 228");
        classicalSongs.add("Liederkreis, Op. 39: No. 5, Mondnacht");
    }

    @Override
    public String getSong() {
        return classicalSongs.get(new Random().nextInt(3));
    }
}
