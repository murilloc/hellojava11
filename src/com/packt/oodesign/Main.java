package com.packt.oodesign;

public class Main {

    public static void main(String... args) {
        double timeSec = 10.0;
        int horsePower = 246;
        int vehicleWeight = 4000;
        Engine engine = new Engine();
        engine.setHorsePower(horsePower);
        Vehicle vehicle = new Car(vehicleWeight, engine, 4);  // polymorphism
        System.out.printf("InnerClassEngineVehicle speed ( %.2f sec = %.2f mph)%n", timeSec, vehicle.getSpeedMph(timeSec));
    }
}
