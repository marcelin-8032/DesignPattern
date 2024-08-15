package com.design.pattern.behavioral.state.videoplayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PausedState implements State {

    @Override
    public void play(VideoPlayer player) {
        log.info("Resuming video.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(VideoPlayer player) {
        log.info("Video is already paused.");
    }

    @Override
    public void stop(VideoPlayer player) {
        log.info("Video stopped.");
        player.setState(new StoppedState());
    }

    @Override
    public void buffer(VideoPlayer player) {
        log.info("Cannot buffer while paused.");
    }
}
