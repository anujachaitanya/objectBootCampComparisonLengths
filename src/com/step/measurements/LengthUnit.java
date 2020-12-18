package com.step.measurements;

public enum LengthUnit implements Unit {
    FEET(300),
    INCH(25),
    CM(10),
    MM(1);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double convertToBase(double anotherLength) {
        return this.conversionFactor * anotherLength;
    }

    @Override
    public double convertFromBase(double valueInBaseUnit) {
        return valueInBaseUnit / this.conversionFactor;
    }
}
