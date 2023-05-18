package com.designpattern.behavioural.observer.weatherforcast;

import java.util.*;

public class WeatherStation implements Subject {

    private List<Observer> observers;
    private int temp;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        if (observerIndex >= 0) {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temp, humidity));
    }

    public void measurementsChanged(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
}
