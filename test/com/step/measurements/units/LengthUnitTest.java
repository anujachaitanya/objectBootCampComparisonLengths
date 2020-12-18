package com.step.measurements.units;

import com.step.measurements.units.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    @Test
    public void shouldConvertGivenInchesToBase() {
        assertEquals(25, LengthUnit.INCH.convertToBase(1), 0);
    }

    @Test
    public void shouldConvertGivenCmToBase() {
        assertEquals(20, LengthUnit.CM.convertToBase(2), 0);
    }

    @Test
    public void shouldConvertGivenFeetToBase() {
        assertEquals(900, LengthUnit.FEET.convertToBase(3), 0);
    }

    @Test
    public void shouldConvertGivenMMToBase() {
        assertEquals(2, LengthUnit.MM.convertToBase(2), 0);
    }
}