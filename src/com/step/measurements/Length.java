package com.step.measurements;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean compare(Length anotherLength) {
        double firstLength = this.lengthUnit.convertToBase(this.value);
        double secondLength = anotherLength.lengthUnit.convertToBase(anotherLength.value);
        return firstLength == secondLength;
    }
}
