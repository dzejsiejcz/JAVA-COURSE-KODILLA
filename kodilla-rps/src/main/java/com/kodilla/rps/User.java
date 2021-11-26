package com.kodilla.rps;

import java.util.Random;

public class User {

    private final String name;

    private int points = 0;
    private final Messages m = new Messages();
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
            output = m.getROCK();
            System.out.println(m.getCOMP_MOVE() + output);
            Thread.sleep(2000);
            return 1;
        } else if (n == 2) {
            output = m.getPAPER();
            System.out.println(m.getCOMP_MOVE() + output);
            Thread.sleep(2000);
            return 2;
        } else if (n == 3) {
            output = m.getSCISSORS();
            System.out.println(m.getCOMP_MOVE() + output);
            Thread.sleep(2000);
            return 3;
        }
        return 0;
    }

    public static String chosenMove(int choice) {
        String output;
        Messages m = new Messages();
        if (choice == 1) {
            output = m.getROCK();
            return output;
        } else if (choice == 2) {
            output = m.getPAPER();
            return output;
        } else if (choice == 3) {
            output = m.getSCISSORS();
            return output;
        }
        output = "Niepoprawnie, powtórzymy tę rundę";
        return output;
    }
}
