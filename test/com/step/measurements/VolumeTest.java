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
}