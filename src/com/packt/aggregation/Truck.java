package com.packt.aggregation;

public class Truck extends Vehicle {

    private int payload = 0;

    public Truck(int weightPounds, int horsePower, int payloadPounds) {
        super(weightPounds + payloadPounds, horsePower);
        this.payload = payloadPounds;
    }

    public int getPayload() {
        return payload;
    }

}
