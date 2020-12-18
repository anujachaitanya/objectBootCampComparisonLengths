package com.step.measurements;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double value;
    private final T unit;

    public Measurement(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Measurement<T> other) {
        return this.convertToBaseUnit() == other.convertToBaseUnit();
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    public double convertTo(T standardUnit) {
        double valueInBase = this.unit.convertToBase(this.value);
        return standardUnit.parse(valueInBase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<?> that = (Measurement<?>) o;
        return Double.compare(Math.round(that.value), Math.round(value)) == 0 &&
                unit.equals(that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
