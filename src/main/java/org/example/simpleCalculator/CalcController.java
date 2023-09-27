package org.example.simpleCalculator;

public class CalcController {
    private CalcModel model;
    private CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void RunCalc() {
        while (true) {
            String input = view.getUserInput();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Calculator exiting...");
                break;
            }
            try {
                String[] tokens = input.split("");
                if (tokens.length != 3) {
                    throw new IllegalArgumentException("Invalid impression format");
                }
                double n1 = Double.parseDouble(tokens[0]);
                double n2 = Double.parseDouble(tokens[2]);
                String operator = tokens[1];

                model.performOperation(n1, n2, operator);
                double result = model.getResult();
                view.displayResult(result);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid expression.");
            }
        }
    }
}
