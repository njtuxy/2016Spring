package com.company;

/**
 * Created by yanxia on 2/10/16.
 */
public class MotorCycle extends Vehicle {
    public MotorCycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitInSpot(ParkingSpot ps){
        return  true;
    }

}
