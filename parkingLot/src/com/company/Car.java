package com.company;

/**
 * Created by yanxia on 2/10/16.
 */
public class Car extends Vehicle {

    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    public boolean canFitInSpot(ParkingSpot ps){
        return  true;
    }

}
