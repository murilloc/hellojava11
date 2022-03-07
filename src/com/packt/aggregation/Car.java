package com.packt.aggregation;

public class Car extends Vehicle {

    private int passengersCount;

    public Car(int weightPounds, int horsePower, int passengersCount) {
        super(weightPounds + passengersCount * 250, horsePower);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

}
