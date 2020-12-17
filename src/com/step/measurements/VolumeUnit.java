package com.step.measurements;

public enum VolumeUnit implements Unit {
    LITRE(1),
    GALLON(3.78);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor){
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double convertToBase(double anotherVolume) {
        return this.conversionFactor * anotherVolume;
    }

    @Override
    public double parse(double valueInBaseUnit) {
        return valueInBaseUnit / this.conversionFactor;
    }

}