package com.step.measurements;

public class Length {
    private final int value;
    private final Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length anotherLength) {
        if(anotherLength.unit == this.unit && this.value == anotherLength.value) {
            return true;
        }

        unit.convert(anotherLength);
    }


}
