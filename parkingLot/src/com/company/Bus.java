package com.company;

/**
 * Created by yanxia on 2/10/16.
 */
public class Bus extends Vehicle {

    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }
    public boolean canFitInSpot(ParkingSpot ps){
        return  true;
    }

}
