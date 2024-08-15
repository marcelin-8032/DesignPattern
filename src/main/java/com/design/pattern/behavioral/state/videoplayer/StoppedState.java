package com.design.pattern.behavioral.state.videoplayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class StoppedState implements State {

    @Override
    public void play(VideoPlayer player) {
        log.info("Starting video.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(VideoPlayer player) {
        log.info("Cannot pause. Video is stopped.");
    }

    @Override
    public void stop(VideoPlayer player) {
        log.info("Video is already stopped.");
    }

    @Override
    public void buffer(VideoPlayer player) {
        log.info("Cannot buffer while stopped.");
    }
}
