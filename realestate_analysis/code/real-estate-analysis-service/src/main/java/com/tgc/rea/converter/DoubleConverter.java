package com.tgc.rea.converter;

import com.opencsv.bean.AbstractBeanField;

public class DoubleConverter extends AbstractBeanField<Double, String> {
    @Override
    protected Double convert(String value) {
        if ("NA".equalsIgnoreCase(value) || value == null || value.trim().isEmpty()) {
            return 0.0; // Replace with a default value or Double.NaN
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid numeric value: " + value, e);
        }
    }
}
