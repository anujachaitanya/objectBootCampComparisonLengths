package com.step.measurements;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnit volumeUnit;

    public Volume(double value, VolumeUnit volumeUnit) {
        this.value = value;
        this.volumeUnit = volumeUnit;
    }

    public boolean compare(Volume anotherVolume) {
        double firstVolume = this.volumeUnit.convertToBase(this.value);
        double secondVolume = anotherVolume.volumeUnit.convertToBase(anotherVolume.value);
        return firstVolume == secondVolume;
    }

    public Volume add(Volume anotherVolume) {
        VolumeUnit standardUnit = VolumeUnit.LITRE;
        double firstLengthInStandard = this.volumeUnit.convertTo(this.value,standardUnit);
        double secondVolumeInStandard = anotherVolume.volumeUnit.convertTo(anotherVolume.value,standardUnit);
        double sumOfLength = firstLengthInStandard + secondVolumeInStandard;
        return new Volume(sumOfLength, standardUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(Math.round(volume.value), Math.round(value)) == 0 && volumeUnit == volume.volumeUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, volumeUnit);
    }
}
