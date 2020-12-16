package com.step.measurements;

import java.util.Objects;

public class Length {
    private static final LengthUnit STANDARD_UNIT = LengthUnit.INCH;
    private final double value;
    private final LengthUnit lengthUnit;

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean compare(Length anotherLength) {
        double firstLength = this.convertToBaseUnit();
        double secondLength = anotherLength.convertToBaseUnit();
        return firstLength == secondLength;
    }

    public Length add(Length anotherLength) {
        double firstLengthInInch = this.convertToStandardUnit();
        double secondLengthInInch = anotherLength.convertToStandardUnit();
        double sumOfLength = firstLengthInInch + secondLengthInInch;
        return new Length(sumOfLength,STANDARD_UNIT);
    }

    private double convertToStandardUnit() {
        return this.lengthUnit.convertTo(this.value, STANDARD_UNIT);
    }

    private double convertToBaseUnit() {
        return this.lengthUnit.convertToBase(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && lengthUnit == length.lengthUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, lengthUnit);
    }
}
