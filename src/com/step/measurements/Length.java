package com.step.measurements;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public ComparisionResult compare(Length anotherLength) {
        double firstLength = this.unit.convertToBase(this.value);
        double secondLength = anotherLength.unit.convertToBase(anotherLength.value);
        if (firstLength < secondLength) {
            return ComparisionResult.SMALLER;
        }
        if (firstLength > secondLength) {
            return ComparisionResult.GREATER;
        }
        return ComparisionResult.EQUAL;
    }
}
