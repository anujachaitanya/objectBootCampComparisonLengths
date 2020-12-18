package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {
    @Test
    public void shouldCompareTwoVolumesWhenEqual() {
        Volume volumeInLitre = new Volume(3.78, VolumeUnit.LITRE);
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        assertTrue(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldCompareTwoVolumesWhenUnequal() {
        Volume volumeInLitre = new Volume(3.73, VolumeUnit.LITRE);
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        assertFalse(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldAddTwoVolumesWithSameUnits() {
        Volume volume = new Volume(2, VolumeUnit.LITRE);
        Volume anotherVolume = new Volume(3, VolumeUnit.LITRE);
        Volume expectedVolume = new Volume(5, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }

    @Test
    public void shouldAddTwoVolumesWithDifferentUnits() {
        Volume volume = new Volume(1, VolumeUnit.LITRE);
        Volume anotherVolume = new Volume(1, VolumeUnit.GALLON);
        Volume expectedVolume = new Volume(4.78, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }
}