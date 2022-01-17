package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        display.displayValue(a+b);
        return a+b;
    }

    public double sub(double a, double b) {
        display.displayValue(a-b);
        return a-b;
    }
    public double mul(double a, double b) {
        display.displayValue(a*b);
        return a*b;
    }
    public double div(double a, double b) {
        try {
            double result = a/b;
            if (result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
            display.displayValue(result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible");
            return 0;
        }
    }

}
