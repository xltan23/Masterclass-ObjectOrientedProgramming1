package oop.c;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
