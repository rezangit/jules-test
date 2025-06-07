package com.example;

public class SumApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java com.example.SumApp <num1> <num2>");
            System.exit(1);
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            System.err.println("Error: Both arguments must be valid numbers.");
            System.exit(1);
        }
    }
}
