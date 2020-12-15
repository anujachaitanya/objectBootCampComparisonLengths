package com.step.measurements;

public class Volume {
    private final double value;
    private final VolumeUnit lengthUnit;

    public Volume(double value, VolumeUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean compare(Volume anotherVolume) {
        double firstVolume = this.lengthUnit.convertToBase(this.value);
        double secondVolume = anotherVolume.lengthUnit.convertToBase(anotherVolume.value);
        return firstVolume == secondVolume;
    }
}
