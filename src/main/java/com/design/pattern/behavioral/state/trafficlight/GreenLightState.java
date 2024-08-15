package com.design.pattern.behavioral.state.trafficlight;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GreenLightState implements TrafficLightState {

    @Override
    public void changeLight(TrafficLight trafficLight) {
        log.info("Changing light from Green to Yellow.");
        trafficLight.setState(new YellowLightState());
    }

    @Override
    public void displayLight() {
       log.info("Green Light - Go!");
    }
}
