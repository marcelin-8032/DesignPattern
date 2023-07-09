package com.design.pattern.behavioral.iterator.songs;

import lombok.Getter;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class SongsOfThe90s implements SongIterator {

    Map<Integer, SongInfo> bestSongs;
    int hashKey = 0;

    public SongsOfThe90s() {
        bestSongs = new Hashtable<>();
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        var songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
