package com.step.measurements;

public class Length  extends Measurement<LengthUnit>{

    public Length(double value, LengthUnit unit){
        super(value, unit);
    }

    public Length add(Length other) {
        LengthUnit standardUnit = LengthUnit.INCH;
        double sumOfLength = this.convertTo(standardUnit) + other.convertTo(standardUnit);
        return new Length(sumOfLength, standardUnit);
    }
}
