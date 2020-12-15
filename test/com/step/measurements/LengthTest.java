package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInFeet() {
        Length length = new Length(1, Unit.FEET);
        Length anotherLength = new Length(12, Unit.INCH);
        assertEquals(ComparisionResult.EQUAL,length.compare(anotherLength));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstLengthIsInCentimeter() {
        Length length = new Length(2, Unit.INCH);
        Length anotherLength = new Length(5, Unit.CM);
        assertEquals(ComparisionResult.EQUAL,length.compare(anotherLength));
    }

    @Test
    public void shouldCompareTwoLengthsWhenOneLengthIsInMM() {
        Length length = new Length(10, Unit.MM);
        Length anotherLength = new Length(1, Unit.CM);
        assertEquals(ComparisionResult.EQUAL, length.compare(anotherLength));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstOneSmaller() {
        Length length = new Length(1, Unit.FEET);
        Length anotherLength = new Length(13, Unit.INCH);
        assertEquals(ComparisionResult.SMALLER,length.compare(anotherLength));
    }

    @Test
    public void shouldCompareTwoLengthWhenFirstOneGreater() {
        Length length = new Length(2, Unit.FEET);
        Length anotherLength = new Length(12, Unit.INCH);
        assertEquals(ComparisionResult.GREATER,length.compare(anotherLength));
    }

}