package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.Messages.*;

public class User {

    private final String name;

    private int points = 0;
    private final Random rand = new Random();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void add1Point() {
        points += 1;
    }

    public int randomMove() throws InterruptedException {

        int n = rand.nextInt(3) + 1;
        String output;
        if (n == 1) {
            output = ROCK;
            System.out.println(COMP_MOVE + output);
            Thread.sleep(2000);
            return 1;
        } else if (n == 2) {
            output = PAPER;
            System.out.println(COMP_MOVE + output);
            Thread.sleep(2000);
            return 2;
        } else {
            output = SCISSORS;
            System.out.println(COMP_MOVE + output);
            Thread.sleep(2000);
            return 3;
        }
    }

    public static String chosenMove(int choice) {
        if (choice == 1) {
            return ROCK;
        } else if (choice == 2) {
            return PAPER;
        } else if (choice == 3) {
            return SCISSORS;
        }
        return BAD_CHOICE;
    }
}
