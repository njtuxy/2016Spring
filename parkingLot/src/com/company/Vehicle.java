package com.company;

import java.util.ArrayList;

/**
 * Created by yanxia on 2/10/16.
 */
public abstract  class Vehicle {

    //One Vehicle may use multiple spot(e.g. a bus), so using a ArrayList to store the spots it had taken.
    protected  ArrayList<ParkingSpot> mySpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded(){
        return spotsNeeded;
    }

    public void parkInSpot(ParkingSpot ps){
        mySpots.add(ps);
    }

    public void clearSpot(ParkingSpot ps){

    }

    public abstract boolean canFitInSpot(ParkingSpot spot);




}
