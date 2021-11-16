package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("testing adding!");
        int resultAdd = calculator.add(2,4);
        if (resultAdd == 6) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("testing subtracting!");
        int resultSubtracting = calculator.subtract(5,9);
        if (resultSubtracting == -4) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
