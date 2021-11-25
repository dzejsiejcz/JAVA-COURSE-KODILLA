package com.kodilla.rps;

import java.util.Random;

public class User {

    private String name;
    private int points = 0;
    private boolean isWinner = false;

    Messages m = new Messages();
    Random rand = new Random();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public void add1Point() {
        points += 1;
    }

    public int randomMove() throws InterruptedException {

        int n = rand.nextInt(3) + 1;
        String output;
        if (n == 1) {
            output = m.getRock();
            System.out.println(m.getCompMove() + output);
            Thread.sleep(2000);
            return 1;
        } else if (n == 2) {
            output = m.getPaper();
            System.out.println(m.getCompMove() + output);
            Thread.sleep(2000);
            return 2;
        } else if (n == 3) {
            output = m.getScissors();
            System.out.println(m.getCompMove() + output);
            Thread.sleep(2000);
            return 3;
        }
        return 0;
    }

    public static String chosenMove(int choice) {
        String output;
        Messages m = new Messages();
        if (choice == 1) {
            output = m.getRock();
            return output;
        } else if (choice == 2) {
            output = m.getPaper();
            return output;
        } else if (choice == 3) {
            output = m.getScissors();
            return output;
        }
        output = "Niepoprawnie, powtórzymy tę rundę";
        return output;
    }
}
