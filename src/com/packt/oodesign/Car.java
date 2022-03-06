package com.packt.oodesign;

public class Car extends Vehicle {

    private int passengerCount = 0;

    public Car(int weightPounds, Engine engine, int passengerCount) {
        super(weightPounds, engine);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
