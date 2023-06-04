package com.design.pattern.behavioral.observer.weatherforcast;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
