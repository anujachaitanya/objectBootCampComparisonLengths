package com.step.measurements;

public enum Unit {
    INCH {
        @Override
        public Length convertToInches(double anotherLength) {
            return new Length(anotherLength, INCH);
        }
    },
    FEET {
        @Override
        public Length convertToInches(double anotherLength) {
            double lengthInInches = anotherLength * 12;
            return new Length(lengthInInches, INCH);
        }
    },
    CM {
        @Override
        public Length convertToInches(double anotherLength) {
            double lengthInInches = anotherLength / 2.5;
            return new Length(lengthInInches, INCH);
        }
    };

    public abstract Length convertToInches(double anotherLength);
}
