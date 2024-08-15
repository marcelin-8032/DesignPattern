package com.design.pattern.behavioral.state.trafficlight;

class TrafficLight {

    private TrafficLightState currentState;

    public TrafficLight() {
        this.currentState = new RedLightState(); // Initial state is Red
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void changeLight() {
        currentState.changeLight(this);
    }

    public void displayLight() {
        currentState.displayLight();
    }
}
