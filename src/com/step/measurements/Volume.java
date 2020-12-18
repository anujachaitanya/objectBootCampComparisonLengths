package com.step.measurements;

public class Volume extends AddableMeasurement<VolumeUnit>{

    public Volume(double value, VolumeUnit unit){
        super(value, unit);
    }

    @Override
    public Volume add(AddableMeasurement<VolumeUnit> other) {
        VolumeUnit standardUnit = VolumeUnit.LITRE;
        double totalMagnitude = this.convertTo(standardUnit) +  other.convertTo(standardUnit);
        return new Volume(totalMagnitude, standardUnit);
    }
}