package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    @Test
    public void shouldCompareTwoTemperaturesWhenEqual() {
        Temperature temperature = new Temperature(100, TemperatureUnit.CELSIUS);
        Temperature anotherTemperature = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        assertTrue(temperature.compare(anotherTemperature));
    }

    @Test
    public void shouldCompareTwoTemperaturesWhenNotEqual() {
        Temperature temperature = new Temperature(101, TemperatureUnit.CELSIUS);
        Temperature anotherTemperature = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        assertFalse(temperature.compare(anotherTemperature));
    }
}