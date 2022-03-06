package com.packt.oodesign;

public class Vehicle {
    private int weightPounds;
    private Engine engine;

    public Vehicle(int weightPounds, Engine engine) {
        if(engine == null) throw new RuntimeException("Engine is a required parameter.");
        this.weightPounds = weightPounds;
        this.engine = engine;
    }

    public double getSpeedMph(double timeSec) {
        if(getEngine() == null){
            throw new RuntimeException("Engine value is required.");
        }
        return getSpeedMph(timeSec, weightPounds);
    }

    public Engine getEngine() {
        return engine;
    }

    public double getSpeedMph(double timeSec, int weightPounds) {
        double v = 2.0 * this.engine.getHorsePower() * 746 * timeSec * 32.17 / weightPounds;
        return Math.round(Math.sqrt(v) * 0.68);
    }
}
