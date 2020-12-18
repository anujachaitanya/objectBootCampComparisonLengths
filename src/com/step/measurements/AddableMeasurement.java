package com.step.measurements;

public abstract class AddableMeasurement<U extends Unit> extends Measurement<U> {
    public AddableMeasurement(double magnitude, U unit) {
        super(magnitude, unit);
    }

    public abstract AddableMeasurement<U> add(AddableMeasurement<U> other);

}
