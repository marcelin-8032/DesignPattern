package com.design.pattern.behavioral.state.trafficlight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class YellowLightState implements TrafficLightState {

    @Override
    public void changeLight(TrafficLight trafficLight) {
        log.info("Changing light from Yellow to Red.");
        trafficLight.setState(new RedLightState());
    }

    @Override
    public void displayLight() {
        log.info("Yellow Light - Slow down!");
    }
}
