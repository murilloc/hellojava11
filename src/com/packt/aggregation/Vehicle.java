package com.packt.aggregation;

public abstract class Vehicle {

    private SpeedModel speedModel;

    int weightPounds, horsePower;

    public Vehicle(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    public void setSpeedModel(SpeedModel speedModel) {
        this.speedModel = speedModel;
    }

    public double getSpeedMph(double timeSec) {
        return this.speedModel.getSpeedMph(timeSec, this.weightPounds, this.horsePower);
    }


}
