package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void shouldConvertGivenInchesToBase() {
        assertEquals(25, Unit.INCH.convertToBase(1), 0);
    }

    @Test
    public void shouldConvertGivenCmToBase() {
        assertEquals(20, Unit.CM.convertToBase(2), 0);
    }

    @Test
    public void shouldConvertGivenFeetToBase() {
        assertEquals(900, Unit.FEET.convertToBase(3), 0);
    }

    @Test
    public void shouldConvertGivenMMToBase() {
        assertEquals(2, Unit.MM.convertToBase(2), 0);
    }

    @Test
    public void shouldConvertGivenGallonToLitre() {
        assertEquals(3.78, Unit.GALLON.convertToBase(1), 0);
    }
}