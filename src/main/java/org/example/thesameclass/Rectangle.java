package org.example.thesameclass;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width < 0) {
            throw new IllegalArgumentException("Can't be less than 0");
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(int side) {
        this(side, side);
    }
}
