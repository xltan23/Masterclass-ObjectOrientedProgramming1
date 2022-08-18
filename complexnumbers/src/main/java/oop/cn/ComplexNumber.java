package oop.cn;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    public void add(double r, double i) {
        this.real += r; 
        this.imaginary += i;
    }

    public void add(ComplexNumber cn) {
        this.real += cn.getReal();
        this.imaginary += cn.getImaginary();
    }
    
    public void subtract(double r, double i) {
        this.real -= r; 
        this.imaginary -= i;
    }

    public void subtract(ComplexNumber cn) {
        this.real -= cn.getReal();
        this.imaginary -= cn.getImaginary();
    }
}
