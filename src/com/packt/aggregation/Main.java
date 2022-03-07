package com.packt.aggregation;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        double timeSec = 10.0;
        int engineHorsePower = 246;
        int vehicleWeightPounds = 4000;

        // Using aggregation from SpeedModel
        Properties drivingConditions = new Properties();
        drivingConditions.put("roadCondition", "Wet");
        drivingConditions.put("tireCondition", "New");
        SpeedModel speedModel = new SpeedModel(drivingConditions);

        Car car2 = new Car( vehicleWeightPounds, engineHorsePower,4);
        car2.setSpeedModel(speedModel);
        System.out.printf("Passengers count= %d %n", car2.getPassengersCount());
        System.out.printf("Car speed (%.2f ) = %.2f mph%n", timeSec, car2.getSpeedMph(timeSec));





    }
}
