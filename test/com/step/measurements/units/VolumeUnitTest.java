package com.step.measurements.units;

import com.step.measurements.units.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeUnitTest {
    @Test
    public void shouldConvertGivenGallonToLitre() {
        assertEquals(3.78, VolumeUnit.GALLON.convertToBase(1), 0);
    }
}