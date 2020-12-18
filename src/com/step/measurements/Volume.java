package com.step.measurements;

public class Volume extends Measurement<VolumeUnit>{

    public Volume(double value, VolumeUnit unit){
        super(value, unit);
    }

    public Volume add(Volume other) {
        VolumeUnit standardUnit = VolumeUnit.LITRE;
        double sumOfVolume = this.convertTo(standardUnit) +  other.convertTo(standardUnit);
        return new Volume(sumOfVolume, standardUnit);
    }
}