package com.design.pattern.behavioral.state.videoplayer;

interface State {

    void play(VideoPlayer player);

    void pause(VideoPlayer player);

    void stop(VideoPlayer player);

    void buffer(VideoPlayer player);
}
