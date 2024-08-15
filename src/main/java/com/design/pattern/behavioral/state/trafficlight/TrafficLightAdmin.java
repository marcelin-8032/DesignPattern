package com.design.pattern.behavioral.state.trafficlight;


class TrafficLightAdmin {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        // Display and change traffic lights
        trafficLight.displayLight();  // Red Light - Stop!
        trafficLight.changeLight();   // Changing light from Red to Green.

        trafficLight.displayLight();  // Green Light - Go!
        trafficLight.changeLight();   // Changing light from Green to Yellow.

        trafficLight.displayLight();  // Yellow Light - Slow down!
        trafficLight.changeLight();   // Changing light from Yellow to Red.

        trafficLight.displayLight();  // Red Light - Stop!
    }
}
