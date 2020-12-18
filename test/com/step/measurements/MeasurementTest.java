package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInFeet() {
        Measurement<LengthUnit> lengthInFeet = Measurement.createLength(1, LengthUnit.FEET);
        Measurement<LengthUnit> lengthInInch = Measurement.createLength(12, LengthUnit.INCH);
        assertTrue(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInCentimeter() {
        Measurement<LengthUnit> lengthInFeet = Measurement.createLength(2, LengthUnit.INCH);
        Measurement<LengthUnit> lengthInCM = Measurement.createLength(5, LengthUnit.CM);
        assertTrue(lengthInFeet.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoLengthsWhenOneLengthIsInMM() {
        Measurement<LengthUnit> lengthInMM = Measurement.createLength(10, LengthUnit.MM);
        Measurement<LengthUnit> lengthInCM = Measurement.createLength(1, LengthUnit.CM);
        assertTrue(lengthInMM.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoUnequalLength() {
        Measurement<LengthUnit> lengthInFeet = Measurement.createLength(2, LengthUnit.FEET);
        Measurement<LengthUnit> lengthInInch = Measurement.createLength(12, LengthUnit.INCH);
        assertFalse(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithSameUnit() {
        Measurement<LengthUnit> lengthInFeet = Measurement.createLength(2, LengthUnit.INCH);
        Measurement<LengthUnit> lengthInInch = Measurement.createLength(12, LengthUnit.INCH);
        Measurement<LengthUnit> sumOfTwoLength = Measurement.createLength(14, LengthUnit.INCH);
        assertEquals(sumOfTwoLength, lengthInFeet.add(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithDifferentUnit() {
        Measurement<LengthUnit> length = Measurement.createLength(2, LengthUnit.INCH);
        Measurement<LengthUnit> anotherLength = Measurement.createLength(2.5, LengthUnit.CM);
        Measurement<LengthUnit> sumOfTwoLengths = Measurement.createLength(3, LengthUnit.INCH);
        assertEquals(sumOfTwoLengths, length.add(anotherLength));
    }

    @Test
    public void shouldCompareTwoVolumesWhenEqual() {
        Measurement<VolumeUnit> volumeInLitre = Measurement.createVolume(3.78, VolumeUnit.LITRE);
        Measurement<VolumeUnit> volumeInGallon = Measurement.createVolume(1, VolumeUnit.GALLON);
        assertTrue(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldCompareTwoVolumesWhenUnequal() {
        Measurement<VolumeUnit> volumeInLitre = Measurement.createVolume(3.73, VolumeUnit.LITRE);
        Measurement<VolumeUnit> volumeInGallon = Measurement.createVolume(1, VolumeUnit.GALLON);
        assertFalse(volumeInLitre.compare(volumeInGallon));
    }

    @Test
    public void shouldAddTwoVolumesWithSameUnits() {
        Measurement<VolumeUnit> volume = Measurement.createVolume(2, VolumeUnit.LITRE);
        Measurement<VolumeUnit> anotherVolume = Measurement.createVolume(3, VolumeUnit.LITRE);
        Measurement<VolumeUnit> expectedVolume = Measurement.createVolume(5, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }

    @Test
    public void shouldAddTwoVolumesWithDifferentUnits() {
        Measurement<VolumeUnit> volume = Measurement.createVolume(1, VolumeUnit.LITRE);
        Measurement<VolumeUnit> anotherVolume = Measurement.createVolume(1, VolumeUnit.GALLON);
        Measurement<VolumeUnit> expectedVolume = Measurement.createVolume(4.78, VolumeUnit.LITRE);
        assertEquals(expectedVolume, volume.add(anotherVolume));
    }

    @Test
    public void shouldCompareTwoTemperaturesWhenEqual() {
        Measurement<TemperatureUnit> temperature = Measurement.createTemperature(100, TemperatureUnit.CELSIUS);
        Measurement<TemperatureUnit> anotherTemperature = Measurement.createTemperature(212, TemperatureUnit.FAHRENHEIT);
        assertTrue(temperature.compare(anotherTemperature));
    }
}