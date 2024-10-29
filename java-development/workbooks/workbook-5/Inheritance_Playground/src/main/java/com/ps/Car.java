package com.ps;

public class Car extends Vehicle{
    private int numOfDoors;
    private String engineType;
    private boolean isConvertable;

    public Car(){
        super();
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public boolean isConvertable() {
        return isConvertable;
    }

    public void setConvertable(boolean convertable) {
        isConvertable = convertable;
    }
}
