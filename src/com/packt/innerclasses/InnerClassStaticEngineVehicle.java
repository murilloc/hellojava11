package com.packt.innerclasses;

public class InnerClassStaticEngineVehicle {

    private Engine engine;

    public InnerClassStaticEngineVehicle(int weightPounds, int horsePower) {
        this.engine = new Engine(horsePower, weightPounds);
    }

    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec);
    }

    private static class Engine {
        private int horsePower = 0;
        private int weightPounds;

        private Engine(int horsePower, int weightPounds) {
            this.horsePower = horsePower;
        }

        private double getSpeedMph(double timeSec) {
            double v = 2.0 * this.horsePower * 746 *
                    timeSec * 32.17 / this.weightPounds;
            return Math.round(Math.sqrt(v) * 0.68);
        }
    }


}
