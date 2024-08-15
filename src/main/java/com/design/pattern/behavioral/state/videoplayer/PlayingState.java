package com.design.pattern.behavioral.state.videoplayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PlayingState implements State {

    @Override
    public void play(VideoPlayer player) {
        log.info("Video is already playing.");
    }

    @Override
    public void pause(VideoPlayer player) {
        log.info("Video paused.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(VideoPlayer player) {
        log.info("Video stopped.");
        player.setState(new StoppedState());
    }

    @Override
    public void buffer(VideoPlayer player) {
        log.info("Video is buffering...");
        player.setState(new BufferingState());
    }
}
