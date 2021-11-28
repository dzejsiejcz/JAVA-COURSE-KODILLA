package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1);
        } catch (Exception e) {
            System.out.println("Bad double numbers");
        } finally {
            System.out.println("Będzie dobrze ;)");
        }
    }
}
