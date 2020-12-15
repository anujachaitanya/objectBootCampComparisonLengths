package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasureTest {
    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInFeet() {
        Measure lengthInFeet = new Measure(1, Unit.FEET);
        Measure lengthInInch = new Measure(12, Unit.INCH);
        assertTrue(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInCentimeter() {
        Measure lengthInFeet = new Measure(2, Unit.INCH);
        Measure lengthInCM = new Measure(5, Unit.CM);
        assertTrue(lengthInFeet.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoLengthsWhenOneLengthIsInMM() {
        Measure lengthInMM = new Measure(10, Unit.MM);
        Measure lengthInCM = new Measure(1, Unit.CM);
        assertTrue(lengthInMM.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoVolumesWhenEqual() {
        Measure volumeInLitre = new Measure(3.78, Unit.LITRE);
        Measure volumeInGallon = new Measure(1, Unit.GALLON);
        assertTrue(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstOneSmaller() {
        Measure lengthInFeet = new Measure(1, Unit.FEET);
        Measure lengthInInch = new Measure(13, Unit.INCH);
        assertFalse(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstOneGreater() {
        Measure lengthInFeet = new Measure(2, Unit.FEET);
        Measure lengthInInch = new Measure(12, Unit.INCH);
        assertFalse(lengthInFeet.compare(lengthInInch));
    }

}