package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInFeet() {
        Length lengthInFeet = new Length(1, LengthUnit.FEET);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertTrue(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInCentimeter() {
        Length lengthInFeet = new Length(2, LengthUnit.INCH);
        Length lengthInCM = new Length(5, LengthUnit.CM);
        assertTrue(lengthInFeet.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoLengthsWhenOneLengthIsInMM() {
        Length lengthInMM = new Length(10, LengthUnit.MM);
        Length lengthInCM = new Length(1, LengthUnit.CM);
        assertTrue(lengthInMM.compare(lengthInCM));
    }

    @Test
    public void shouldCompareTwoUnequalLength() {
        Length lengthInFeet = new Length(2, LengthUnit.FEET);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertFalse(lengthInFeet.compare(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithSameUnit() {
        Length lengthInFeet = new Length(2, LengthUnit.INCH);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        Length sumOfTwoLength = new Length(14, LengthUnit.INCH);
        assertEquals(sumOfTwoLength, lengthInFeet.add(lengthInInch));
    }

    @Test
    public void shouldAddTwoLengthsWithDifferentUnit() {
        Length length = new Length(2, LengthUnit.INCH);
        Length anotherLength = new Length(2.5, LengthUnit.CM);
        Length sumOfTwoLengths = new Length(3, LengthUnit.INCH);
        assertEquals(sumOfTwoLengths, length.add(anotherLength));
    }
}