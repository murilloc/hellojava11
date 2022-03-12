package com.packt.interfaces;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        double timeSec = 10.0;
        int horsePower = 246;
        int vehicleWeight = 4000;
        Properties drivingConditions = new Properties();
        drivingConditions.put("roadCondition", "Wet");
        drivingConditions.put("tireCondition", "New");
        SpeedModel speedModel = FactorySpeedModel.generateSpeedModel(drivingConditions);
        Car car = FactoryVehicle.buildCar(4, vehicleWeight, horsePower);
        car.setSpeedModel(speedModel);
        System.out.printf("Car speed ( %.2f sec) = %.2f mph %n", timeSec, car.getSpeedMph(timeSec));
    }
}
