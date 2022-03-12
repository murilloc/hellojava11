package com.packt.interfaces;

public interface Truck extends Vehicle {
    int getPayloadPounds();

    default int getPayloadKg() {
        return (int) Math.round(0.454 * getPayloadPounds());
    }

    static int convertKgToPounds(int kilograms) {
        return (int) Math.round(2.205 * kilograms);
    }

    default int getWeightKg(int pounds) {
        return (int) Math.round(0.454 * pounds);
    }



}
