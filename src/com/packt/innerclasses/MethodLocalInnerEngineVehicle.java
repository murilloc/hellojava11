package com.packt.innerclasses;

public class MethodLocalInnerEngineVehicle {
    private int weightPounds = 0;
    private int horsePower = 0;

    public MethodLocalInnerEngineVehicle(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    private int getWeightPounds() {
        return weightPounds;
    }

    public double getSpedMph(double timeSec) {

        // method local inner class
        class Engine {
            private int horsePower = 0;

            private Engine(int horsePower) {
                this.horsePower = horsePower;
            }

            private double getSpeedMph(double timeSec) {
                double v = 2.0 * this.horsePower * 746 *
                        timeSec * 32.17 / getWeightPounds();
                return Math.round(Math.sqrt(v) * 0.68);
            }
        }

        Engine engine = new Engine(this.horsePower);
        return engine.getSpeedMph(timeSec);
    }
}
