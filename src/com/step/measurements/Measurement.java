package com.step.measurements;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double value;
    private final T unit;

    public Measurement(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Measurement<T> anotherMeasurement) {
        double firstMeasurement = this.convertToBaseUnit();
        double secondMeasurement = anotherMeasurement.convertToBaseUnit();
        return secondMeasurement == firstMeasurement;
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    public Measurement<T> add(Measurement<T> anotherMeasurement) {
        Unit standardUnit = this.unit.getStandardUnit();
        double firstLengthInStandard = convertToStandard(standardUnit);
        double secondLengthInStandard = anotherMeasurement.convertToStandard(standardUnit);
        double sumOfLength = firstLengthInStandard + secondLengthInStandard;
        return new Measurement(sumOfLength, standardUnit);
    }


    private double convertToStandard(Unit standardUnit) {
        double valueInBase = this.unit.convertToBase(this.value);
        return standardUnit.parse(valueInBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<T> that = (Measurement<T>) o;
        return Double.compare(that.value, value) < 0.01 && unit.equals(that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
