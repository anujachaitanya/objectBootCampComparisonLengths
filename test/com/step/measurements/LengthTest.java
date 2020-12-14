package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareTwoEqualLengths() {
        Length length = new Length(1, Unit.FEET);
        Length anotherLength = new Length(12, Unit.INCHES);
        assertTrue(length.compare(anotherLength));
    }
}