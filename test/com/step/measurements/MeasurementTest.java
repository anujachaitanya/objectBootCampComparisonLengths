package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInFeet() {
        Measurement<LengthUnit> lengthInFeet = new Measurement<>(1, LengthUnit.FEET);
        Measurement<LengthUnit> lengthInInch = new Measurement<>(12, LengthUnit.INCH);
        assertTrue(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInCentimeter() {
        Measurement<LengthUnit> lengthInFeet = new Measurement<>(2, LengthUnit.INCH);
        Measurement<LengthUnit> lengthInCM = new Measurement<>(5, LengthUnit.CM);
        assertTrue(lengthInFeet.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoLengthsWhenOneLengthIsInMM() {
        Measurement<LengthUnit> lengthInMM = new Measurement<>(10, LengthUnit.MM);
        Measurement<LengthUnit> lengthInCM = new Measurement<>(1, LengthUnit.CM);
        assertTrue(lengthInMM.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoUnequalLength() {
        Measurement<LengthUnit> lengthInFeet = new Measurement<>(2, LengthUnit.FEET);
        Measurement<LengthUnit> lengthInInch = new Measurement<>(12, LengthUnit.INCH);
        assertFalse(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithSameUnit() {
        Measurement<LengthUnit> lengthInFeet = new Measurement<>(2, LengthUnit.INCH);
        Measurement<LengthUnit> lengthInInch = new Measurement<>(12, LengthUnit.INCH);
        Measurement<LengthUnit> sumOfTwoLength = new Measurement<>(14, LengthUnit.INCH);
        assertEquals(sumOfTwoLength, lengthInFeet.add(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithDifferentUnit() {
        Measurement<LengthUnit> length = new Measurement<>(2, LengthUnit.INCH);
        Measurement<LengthUnit> anotherLength = new Measurement<>(2.5, LengthUnit.CM);
        Measurement<LengthUnit> sumOfTwoLengths = new Measurement<>(3, LengthUnit.INCH);
        assertEquals(sumOfTwoLengths, length.add(anotherLength));
    }

    @Test
    public void shouldCompareTwoVolumesWhenEqual() {
        Measurement<VolumeUnit> volumeInLitre = new Measurement<>(3.78, VolumeUnit.LITRE);
        Measurement<VolumeUnit> volumeInGallon = new Measurement<>(1, VolumeUnit.GALLON);
        assertTrue(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldCompareTwoVolumesWhenUnequal() {
        Measurement<VolumeUnit> volumeInLitre = new Measurement<>(3.73, VolumeUnit.LITRE);
        Measurement<VolumeUnit> volumeInGallon = new Measurement<>(1, VolumeUnit.GALLON);
        assertFalse(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldAddTwoVolumesWithSameUnits() {
        Measurement<VolumeUnit> volume = new Measurement<>(2, VolumeUnit.LITRE);
        Measurement<VolumeUnit> anotherVolume = new Measurement<>(3, VolumeUnit.LITRE);
        Measurement<VolumeUnit> expectedVolume = new Measurement<>(5, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }

    @Test
    public void shouldAddTwoVolumesWithDifferentUnits() {
        Measurement<VolumeUnit> volume = new Measurement<>(1, VolumeUnit.LITRE);
        Measurement<VolumeUnit> anotherVolume = new Measurement<>(1, VolumeUnit.GALLON);
        Measurement<VolumeUnit> expectedVolume = new Measurement<>(4.78, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }
}