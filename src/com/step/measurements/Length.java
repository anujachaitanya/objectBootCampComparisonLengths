package com.step.measurements;

import com.step.measurements.units.LengthUnit;

public class Length extends AddableMeasurement<LengthUnit> {

    public Length(double value, LengthUnit magnitude){
        super(value, magnitude);
    }

    @Override
    public Length add(AddableMeasurement<LengthUnit> other) {
        LengthUnit standardUnit = LengthUnit.INCH;
        double totalMagnitude = this.convertTo(standardUnit) +  other.convertTo(standardUnit);
        return new Length(totalMagnitude, standardUnit);
    }
}
