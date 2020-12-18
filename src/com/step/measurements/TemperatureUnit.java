package com.step.measurements;

public enum TemperatureUnit implements Unit{
    CELSIUS(1.8,32),
    FAHRENHEIT(1,0);

    private final double conversionFactor;
    private final int constant;

    TemperatureUnit(double conversionFactor,int constant) {
        this.conversionFactor = conversionFactor;
        this.constant = constant;
    }

    @Override
    public double convertToBase(double anotherTemperature) {
        return (anotherTemperature * conversionFactor) + this.constant;
    }

    @Override
    public double convertFromBase(double valueInBaseUnit) {
        return valueInBaseUnit / conversionFactor ;
    }
}
