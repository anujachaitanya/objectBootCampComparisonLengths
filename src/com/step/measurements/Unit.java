package com.step.measurements;

public interface Unit {
    double convertToBase(double anotherVolume);

    double convertFromBase(double valueInBaseUnit);
}
