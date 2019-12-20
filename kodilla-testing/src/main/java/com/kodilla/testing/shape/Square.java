package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private String field;

    public Square(String shapeName, String field) {
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
