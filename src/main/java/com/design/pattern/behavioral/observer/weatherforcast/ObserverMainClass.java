package com.design.pattern.behavioral.observer.weatherforcast;

import java.util.Random;

public class ObserverMainClass {

    public static void main(String[] args) throws InterruptedException {


        var weatherStation = new WeatherStation();
        var currentConditionDisplay = new CurrentConditionDisplay(weatherStation);
        var forecastDisplay = new ForecastDisplay(weatherStation);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Update " + i + " ---");

            int randomTemp = getRandomint(-50, 40);
            int randomHumidity = getRandomint(0, 100);

            weatherStation.measurementsChanged(randomTemp, randomHumidity);
            Thread.sleep(1000);
        }


    }

    private static int getRandomint(int min, int max) {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }
}
