package com.design.pattern.behavioral.iterator.songs;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator {

    List<SongInfo> bestSongs= new ArrayList<>();

    public SongsOfThe70s() {
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        var songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {

        return bestSongs.iterator();
    }
}
