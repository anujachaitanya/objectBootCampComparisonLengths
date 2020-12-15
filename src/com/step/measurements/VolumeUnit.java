package com.step.measurements;

public enum VolumeUnit {
    LITRE(1),
    GALLON(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double anotherVolume) {
        return this.conversionFactor * anotherVolume;
    }
}
