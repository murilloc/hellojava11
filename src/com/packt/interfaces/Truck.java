package com.packt.interfaces;

public interface Truck extends Vehicle {
    int getPayloadPounds();

    default int getPayloadKg(int pounds) {
        return convertPoundsToKg(pounds);
    }

    static int convertKgToPounds(int kilograms) {
        return (int) Math.round(2.205 * kilograms);
    }

//    default int getWeightKg(int pounds) {
//        return (int) Math.round(0.454 * pounds);
//    }

    static int convertPoundsToKg(int pounds) {
        return (int) Math.round(0.454 * pounds);
    }


}
