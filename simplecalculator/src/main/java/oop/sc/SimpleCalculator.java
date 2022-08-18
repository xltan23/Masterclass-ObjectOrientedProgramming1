package oop.sc;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }


    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(6.0);
        sc.setSecondNumber(3.0);
        
        double addResult = sc.getAdditionResult();
        System.out.println(addResult);

        double subtractResult = sc.getSubtractionResult();
        System.out.println(subtractResult);

        double productResult = sc.getMultiplicationResult();
        System.out.println(productResult);

        double divideResult = sc.getDivisionResult();
        System.out.println(divideResult);
    }
}
