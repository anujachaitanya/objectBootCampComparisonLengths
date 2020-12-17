package com.step.measurements;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double value;
    private final T unit;
    private final T standardUnit;

    private Measurement(double value, T unit, T standardUnit) {
        this.value = value;
        this.unit = unit;
        this.standardUnit = standardUnit;
    }

    public static Measurement<LengthUnit> createLength(double value, LengthUnit unit){
        return new Measurement<>(value, unit, LengthUnit.INCH);
    }

    public static Measurement<VolumeUnit> createVolume(double value, VolumeUnit unit){
        return new Measurement<>(value, unit, VolumeUnit.LITRE);
    }

    public boolean compare(Measurement<T> anotherMeasurement) {
        double firstMeasurement = this.convertToBaseUnit();
        double secondMeasurement = anotherMeasurement.convertToBaseUnit();
        return secondMeasurement == firstMeasurement;
    }

    public Measurement<T> add(Measurement<T> anotherMeasurement) {
        double firstLengthInStandard = convertToStandard();
        double secondLengthInStandard = anotherMeasurement.convertToStandard();
        double sumOfLength = firstLengthInStandard + secondLengthInStandard;
        return new Measurement<>(sumOfLength, this.standardUnit, this.standardUnit);
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    private double convertToStandard() {
        double valueInBase = this.unit.convertToBase(this.value);
        return this.standardUnit.parse(valueInBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<?> that = (Measurement<?>) o;
        return Double.compare(Math.round(that.value), Math.round(value)) == 0 &&
                unit.equals(that.unit) &&
                standardUnit.equals(that.standardUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit, standardUnit);
    }
}
