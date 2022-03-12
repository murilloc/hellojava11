package com.packt.interfaces;

public class Main {

    public static void main(String[] args) {

        int horsePower = 246;
        int payload = Truck.convertKgToPounds(1500);
        int vehicleWeight = Truck.convertKgToPounds(1800);
        //Truck truck = FactoryVehicle.buildTruck(payload, vehicleWeight, horsePower);
        System.out.printf("Weight in pounds: %d%n", vehicleWeight);
        //int kg = truck.getWeightKg(vehicleWeight);
        int kg = Truck.convertPoundsToKg(vehicleWeight);
        System.out.printf("Weight converted to Kg: %d%n", kg);
        System.out.printf("Weight converted back to pounds: %d%n", Truck.convertKgToPounds(kg));

    }
}
