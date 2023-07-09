package com.design.pattern.behavioral.iterator.songs;

public class SongIteratorMainClass {


    public static void main(String[] args) {

        var songs70=new SongsOfThe70s();
        var songs80=new SongsOfThe80s();
        var songs90=new SongsOfThe90s();

        var songOfMohsen=new DiscJockey(songs70,songs80,songs90);
        songOfMohsen.showTheSong70();
        songOfMohsen.showTheSong80();
        songOfMohsen.showTheSong90();
    }
}
