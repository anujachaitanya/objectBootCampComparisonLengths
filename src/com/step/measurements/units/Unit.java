package com.step.measurements.units;

public interface Unit {
    double convertToBase(double anotherVolume);

    double convertFromBase(double valueInBaseUnit);
}
