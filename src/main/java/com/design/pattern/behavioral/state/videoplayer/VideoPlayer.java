package com.design.pattern.behavioral.state.videoplayer;

class VideoPlayer {

    private State currentState;

    public VideoPlayer() {
        this.currentState = new StoppedState(); // Initial state is Stopped
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public void buffer() {
        currentState.buffer(this);
    }
}
