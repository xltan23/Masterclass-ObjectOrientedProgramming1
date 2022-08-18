package oop.cn;

public class Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(3, 4);
        ComplexNumber cn2 = new ComplexNumber(5, 6);

        cn1.add(cn2);
        System.out.println(cn1.getReal());
        System.out.println(cn1.getImaginary());

        cn1.add(2, 3);
        System.out.println(cn1.getReal());
        System.out.println(cn1.getImaginary());

        cn2.subtract(cn1);
        System.out.println(cn2.getReal());
        System.out.println(cn2.getImaginary());

        cn2.subtract(-6, -13);
        System.out.println(cn2.getReal());
        System.out.println(cn2.getImaginary());
    }
    
}
