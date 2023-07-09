package com.design.pattern.behavioral.iterator.songs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DiscJockey {
    SongIterator iterator70;
    SongIterator iterator80;
    SongIterator iterator90;

    public DiscJockey(SongIterator iterator70, SongIterator iterator80, SongIterator iterator90) {
        this.iterator70 = iterator70;
        this.iterator80 = iterator80;
        this.iterator90 = iterator90;
    }


    public void showTheSong70() {
        var songs70s = iterator70.createIterator();
        log.info("Songs of the 70s\n ");
        while (songs70s.hasNext()) {
            SongInfo songInfo = (SongInfo) songs70s.next();
            log.info(songInfo.getSongName());
            log.info(songInfo.getSongName());
            log.info(String.valueOf(songInfo.yearReleased));
        }
    }


    public void showTheSong80() {
        var songs80s = iterator80.createIterator();
        log.info("Songs of the 80s\n ");
        while (songs80s.hasNext()) {
            SongInfo songInfo = (SongInfo) songs80s.next();
            log.info(songInfo.getSongName());
            log.info(songInfo.getSongName());
            log.info(String.valueOf(songInfo.yearReleased));
        }
    }

    public void showTheSong90() {
        var songs90s = iterator90.createIterator();
        log.info("Songs of the 90s\n ");
        while (songs90s.hasNext()) {
            SongInfo songInfo = (SongInfo) songs90s.next();
            log.info(songInfo.getSongName());
            log.info(songInfo.getSongName());
            log.info(String.valueOf(songInfo.yearReleased));
        }
    }
}
