package org.example.simpleCalculator;

public class CalcModel {
    private double result;

    public void performOperation(double n1, double n2, String operator) {
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                result = n1 / n2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);

        }
    }

    public double getResult() {
        return result;
    }
}