package com.design.pattern.behavioral.state.trafficlight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class RedLightState implements TrafficLightState {

    @Override
    public void changeLight(TrafficLight trafficLight) {
        log.info("Changing light from Red to Green.");
        trafficLight.setState(new GreenLightState());
    }

    @Override
    public void displayLight() {
        log.info("Red Light - Stop!");
    }
}
