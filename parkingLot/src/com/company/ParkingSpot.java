package com.company;

/**
 * Created by yanxia on 2/10/16.
 */
public class ParkingSpot {
    private Vehicle vehicle;
    private Level level;
    private int spotNumber;

    public boolean isAvailable(){
        return vehicle == null;
    }


}
