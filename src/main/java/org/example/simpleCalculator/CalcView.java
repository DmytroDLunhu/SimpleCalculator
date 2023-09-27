package org.example.simpleCalculator;

import java.util.Scanner;

public class CalcView {
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        return scanner.nextLine();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
