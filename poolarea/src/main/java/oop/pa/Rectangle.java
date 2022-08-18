package oop.pa;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double w, double l) {
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }
        if (l < 0) {
            this.length = 0;
        } else {
            this.length = l;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width*this.length;
    }
}
