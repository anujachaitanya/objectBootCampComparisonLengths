package com.step.measurements;

import com.step.measurements.units.TemperatureUnit;

public class Temperature extends Measurement<TemperatureUnit>{
    public Temperature(double value, TemperatureUnit unit){
        super(value, unit);
    }

}
