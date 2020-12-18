package com.step.measurements;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double magnitude;
    private final T unit;

    public Measurement(double magnitude, T unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public boolean compare(Measurement<T> other) {
        return this.convertToBaseUnit() == other.convertToBaseUnit();
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.magnitude);
    }

    public double convertTo(T standardUnit) {
        double valueInBase = this.unit.convertToBase(this.magnitude);
        return standardUnit.convertFromBase(valueInBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<?> that = (Measurement<?>) o;
        return Double.compare(Math.round(that.magnitude), Math.round(magnitude)) == 0 &&
                unit.equals(that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }
}
