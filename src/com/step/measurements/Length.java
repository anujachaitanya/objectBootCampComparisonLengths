package com.step.measurements;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public ComparisionResult compare(Length anotherLength) {
        Length firstLength = this.unit.convertToInches(this.value);
        Length secondLength = anotherLength.unit.convertToInches(anotherLength.value);
        if (firstLength.value < secondLength.value) {
            return ComparisionResult.SMALLER;
        }
        if (firstLength.value > secondLength.value) {
            return ComparisionResult.GREATER;
        }
        return ComparisionResult.EQUAL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
