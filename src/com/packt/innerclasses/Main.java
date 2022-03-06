package com.packt.innerclasses;

public class Main {
    public static void main(String[] args) {

        double timeSec = 10.0;
        int engineHorsePower = 246;
        int vehicleWeightPounds = 4000;


        // Inner class implementation
        InnerClassEngineVehicle vehicle = new InnerClassEngineVehicle(vehicleWeightPounds, engineHorsePower);
        System.out.printf("Vehicle speed (%.2f sec) = %.2f mph%n", timeSec, vehicle.getSpeedMph(timeSec));

        // Method local inner class implementation
        MethodLocalInnerEngineVehicle vehicle2 = new MethodLocalInnerEngineVehicle(vehicleWeightPounds, engineHorsePower);
        System.out.printf("Vehicle speed (%.2f sec) = %.2f mph%n", timeSec, vehicle2.getSpedMph(timeSec));


        // Anonymous inner class implementation
        InnerClassEngineVehicle vehicle3 = new InnerClassEngineVehicle(vehicleWeightPounds, engineHorsePower) {
            public double getSpeedMph(double timeSec) {
                return -1.0d;
            }
        };

        System.out.printf("Vehicle speed (%.2f sec) = %.2f mph%n", timeSec, vehicle3.getSpeedMph(timeSec));


    }
}
