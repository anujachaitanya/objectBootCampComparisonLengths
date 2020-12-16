package com.step.measurements;

public enum LengthUnit {
    FEET(300),
    INCH(25),
    CM(10),
    MM(1);


    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double anotherLength) {
        return this.conversionFactor * anotherLength;
    }

    public double convertToStandardUnit(double value) {
        double valueInBaseUnit = this.convertToBase(value);
        return valueInBaseUnit / LengthUnit.INCH.conversionFactor;
    }
}
