package com.design.pattern.behavioral.mediator.controltower;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class ControlTower implements IControlTower {

    private List<AircraftService> aircraftServices;

    public ControlTower() {
        this.aircraftServices = new ArrayList<>();
    }

    public void registerAircraftService(AircraftService aircraftService) {
        this.aircraftServices.add(aircraftService);
    }

    @Override
    public void notify(AircraftService sender, String event) {
        if (event.equals("request_landing")) {
            for (AircraftService aircraftService : aircraftServices) {
                if (aircraftService != sender && aircraftService.isLanding()) {
                    log.info("Control Tower: Aircraft " + sender.getAircraft().getCallSign() +
                            " cannot land because " + aircraftService.getAircraft().getCallSign() +
                            " is landing.");
                    return;
                }
            }
            log.info("Control Tower: Aircraft " + sender.getAircraft().getCallSign() + " is cleared to land.");
        } else if (event.equals("request_takeoff")) {
            for (AircraftService aircraftService : aircraftServices) {
                if (aircraftService != sender && aircraftService.isLanding()) {
                    log.info("Control Tower: Aircraft " + sender.getAircraft().getCallSign() +
                            " must wait for " + aircraftService.getAircraft().getCallSign() +
                            " to land before taking off.");
                    return;
                }
            }
            log.info("Control Tower: Aircraft " + sender.getAircraft().getCallSign() + " is cleared to take off.");
        }
    }


    public static void main(String[] args) {
        var controlTower = new ControlTower();

        var aircraft1 = new Aircraft("Flight 101");
        var aircraft2 = new Aircraft("Flight 202");
        var aircraft3 = new Aircraft("Flight 303");

        var aircraftService1 = new AircraftService(aircraft1, controlTower);
        var aircraftService2 = new AircraftService(aircraft2, controlTower);
        var aircraftService3 = new AircraftService(aircraft3, controlTower);

        controlTower.registerAircraftService(aircraftService1);
        controlTower.registerAircraftService(aircraftService2);
        controlTower.registerAircraftService(aircraftService3);

        aircraftService1.requestLanding();
        aircraftService2.requestLanding();
        aircraftService3.requestLanding();
    }
}
