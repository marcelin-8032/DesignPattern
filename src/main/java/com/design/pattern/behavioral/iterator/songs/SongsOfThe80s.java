package com.design.pattern.behavioral.iterator.songs;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe80s implements SongIterator{

    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];
        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears for Fears", 1985);
    }

    private void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
