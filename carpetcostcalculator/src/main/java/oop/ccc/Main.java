package oop.ccc;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(3.5, 6);
        Carpet carpet = new Carpet(5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}
