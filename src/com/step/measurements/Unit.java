package com.step.measurements;

public enum Unit {
    FEET(300),
    INCH(25),
    CM(10),
    MM(1),
    LITRE(1),
    GALLON(3.78);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double anotherLength) {
        return this.conversionFactor * anotherLength;
    }
}
