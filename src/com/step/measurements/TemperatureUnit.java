package com.step.measurements;

public enum TemperatureUnit implements Unit{
    CELSIUS(1), FAHRENHEIT(2.12);

    private final double conversionFactor;

    TemperatureUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double convertToBase(double anotherTemperature) {
        return anotherTemperature * conversionFactor;
    }

    @Override
    public double parse(double valueInBaseUnit) {
        return valueInBaseUnit / conversionFactor;
    }
}
