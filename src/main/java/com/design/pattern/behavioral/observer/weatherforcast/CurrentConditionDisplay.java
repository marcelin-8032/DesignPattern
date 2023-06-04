package com.design.pattern.behavioral.observer.weatherforcast;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionDisplay implements Observer {

    private int temp;
    private int humidity;

    public CurrentConditionDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        displayCurrent();
    }

    private void displayCurrent() {
        log.info("Current Temperature: " + temp);
        log.info("Current Humidity: " + humidity);
    }
}
