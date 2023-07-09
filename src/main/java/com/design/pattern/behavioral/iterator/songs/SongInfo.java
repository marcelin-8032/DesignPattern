package com.design.pattern.behavioral.iterator.songs;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter(AccessLevel.NONE)
public class SongInfo {

    String songName;
    String bandName;
    int yearReleased;


}
