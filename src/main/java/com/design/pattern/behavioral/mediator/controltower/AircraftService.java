package com.design.pattern.behavioral.mediator.controltower;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
class AircraftService {

    private Aircraft aircraft;

    private IControlTower iControlTower;

    private boolean landing;

    public AircraftService(Aircraft aircraft, IControlTower iControlTower) {
        this.aircraft = aircraft;
        this.iControlTower = iControlTower;
        this.landing = false;
    }

    public void requestLanding(){
        log.info(aircraft.getCallSign()+": Requesting landing.");
        this.landing=true;
        iControlTower.notify(this,"request_landing");
    }

    public void requestTakeOff(){
        log.info(aircraft.getCallSign()+": Requesting takeOff.");
        this.landing=false;
        iControlTower.notify(this,"request_takeOff");
    }
}
