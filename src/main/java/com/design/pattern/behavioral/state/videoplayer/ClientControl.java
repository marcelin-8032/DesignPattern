package com.design.pattern.behavioral.state.videoplayer;

public class ClientControl {

    public static void main(String[] args) {

        var player = new VideoPlayer();

        // Playing the video
        player.play();  // Output: Starting video.

        // Buffering the video
        player.buffer();  // Output: Video is buffering...

        // Trying to play while buffering
        player.play();  // Output: Cannot play while buffering. Please wait.

        // Stop buffering and stop the video
        player.stop();  // Output: Stopping buffering and stopping video.

        // Play the video again
        player.play();  // Output: Starting video.

        // Pause the video
        player.pause();  // Output: Video paused.

        // Stop the video
        player.stop();  // Output: Video stopped.
    }
}
