package com.design.pattern.behavioral.state.videoplayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BufferingState implements State{

    @Override
    public void play(VideoPlayer player) {
       log.info("Cannot play while buffering. Please wait.");
    }

    @Override
    public void pause(VideoPlayer player) {
        log.info("Cannot pause while buffering.");
    }

    @Override
    public void stop(VideoPlayer player) {
        log.info("Stopping buffering and stopping video.");
        player.setState(new StoppedState());
    }

    @Override
    public void buffer(VideoPlayer player) {
        log.info("Already buffering...");
    }
}
