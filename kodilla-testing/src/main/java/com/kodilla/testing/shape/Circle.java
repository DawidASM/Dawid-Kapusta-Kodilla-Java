package com.kodilla.testing.shape;

import java.lang.reflect.Field;

public class Circle implements Shape{
    private String shapeName;
    private String field;

    public Circle(String shapeName, String field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String getField() {
        return field;
    }
}
