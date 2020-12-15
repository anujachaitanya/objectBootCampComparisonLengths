package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {
    @Test
    public void shouldConvertGivenGallonToLitre() {
        assertEquals(3.78, VolumeUnit.GALLON.convertToBase(1), 0);
    }
}