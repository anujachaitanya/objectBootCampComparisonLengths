package com.step.measurements;

public class Measure {
    private final double value;
    private final Unit unit;

    public Measure(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Measure anotherMeasure) {
        double firstMeasure = this.unit.convertToBase(this.value);
        double secondMeasure = anotherMeasure.unit.convertToBase(anotherMeasure.value);
        return firstMeasure == secondMeasure;
    }
}
