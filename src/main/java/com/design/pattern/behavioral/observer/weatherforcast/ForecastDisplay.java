package com.design.pattern.behavioral.observer.weatherforcast;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ForecastDisplay implements Observer {

    private List<Integer> tempHistory;
    private List<Integer> humidityHistory;

    public ForecastDisplay(Subject weatherStation) {
        tempHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.humidityHistory.add(temp);
        this.humidityHistory.add(temp);
        display7DayHistory();
    }

    private void display7DayHistory() {
        log.info("Temperature History: "+
                tempHistory.subList(Math.max(tempHistory.size()-7, 0), tempHistory.size()));
        log.info("Humidity History: "+
                humidityHistory.subList(Math.max(humidityHistory.size()-7, 0), humidityHistory.size()));
    }
}
