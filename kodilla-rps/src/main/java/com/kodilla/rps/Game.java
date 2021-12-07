package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.kodilla.rps.Messages.*;

public class Game {
    private boolean isFinished = false;
    private final Scanner sc = new Scanner(System.in);
    private final User comp = new User("Komputer");
    private String approval;
    private String choice;

    public int battle() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(NEW_GAME + YOUR_NAME);
        String name = sc.nextLine();
        User user = new User(name);

        //user must choose quantity of winner
        int rounds = getRounds();

        //preparing game
        RoundsCounter roundsCounter = new RoundsCounter(rounds);
        Winner winner = new Winner(roundsCounter, user, comp);
        sc.nextLine();
        Thread.sleep(1000);

        //processing rounds
        while (!isFinished) {

            int counterRounds = roundsCounter.getFinishedRounds()+1;
            System.out.println(NEXT_ROUND + counterRounds);
            Thread.sleep(1000);
            int next = move(winner);
            if (next == -1) {
                return -1;
            }
            if (next == 1) {
                return 1;
            }

            //counting rounds
            isFinished = roundsCounter.isFinishedGame();
            Thread.sleep(1000);

            //actual result
            System.out.println(ACTUAL_RESULT + user.getName() + ": " + user.getPoints() +
                    "\n" + comp.getName() + ": " + comp.getPoints() + "\n");
            Thread.sleep(1000);
        }

        Thread.sleep(1000);

        //print result of the game
        if (user.getPoints() == comp.getPoints()) {
            System.out.println(DRAW);
        } else if (user.getPoints() > comp.getPoints()) {
            System.out.println(END_GAME + user.getName());
        } else {
            System.out.println(END_GAME + comp.getName());
        }
        Thread.sleep(1000);
        System.out.println(RESULT_OF_GAME + user.getName() + ": " + user.getPoints() +
                "\n" + comp.getName() + ": " + comp.getPoints()+ "\n");
        Thread.sleep(2000);
        return 0;
    }

    private int move(Winner winner) throws InterruptedException {
        System.out.println(YOUR_MOVE);
        choice = sc.nextLine();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {


            //the user is able to close the game in any time
            if (choice.equals("x")) {
                if (exitGame()) {
                    return -1;
                }
                System.out.println(YOUR_MOVE);
                choice = sc.nextLine();
                continue;
            }
            if (choice.equals("n")) {
                if (newGame()) {
                    return 1;
                }
                System.out.println(YOUR_MOVE);
                choice = sc.nextLine();
                continue;
            }
            System.out.println(BAD_CHOICE);
            choice = sc.nextLine();
        }

        //move
        int userMove = Integer.parseInt(choice);
        System.out.println(Messages.userMove(userMove));

        Thread.sleep(1000);
        System.out.println(winner.effect(userMove, comp.randomMove()));
        return  0;
    }

    private int getRounds() {
        boolean check = true;
        int rounds = 1;
        do {
            System.out.println(NUMB_ROUNDS);
            try {
                rounds = sc.nextInt();
                if (rounds > 0) {
                    check = false;
                } else {
                    System.out.println(ERROR_FORMAT);
                }
            } catch (InputMismatchException e) {
                System.out.println(ERROR_FORMAT);
                sc.next();
            }
        }
        while (check);
        return rounds;
    }

    public boolean exitGame() {
        return approve(CONFIDENCE_ENDS, "t", "n");
    }

    private boolean newGame() {
        return approve(CONFIDENCE_NEW_GAME, "t", "n");
    }

    private boolean approve(String confidence, String t, String n) {

        do {
            System.out.println(confidence);
            approval = sc.nextLine().toLowerCase();
            if (approval.equals(t)) {
                return true;
            } else if (approval.equals(n)) {
                return false;
            }
            System.out.println(BAD_CHOICE);
        }
        while (!approval.equals(t) && !approval.equals(n));
        return false;
    }

    public int lastDecide() {
        Scanner sc = new Scanner(System.in);
        System.out.println(FINISH_CHOICE);
        choice = sc.nextLine().toLowerCase();

        while (!choice.equals("n") && !choice.equals("x")){
            System.out.println(BAD_CHOICE);
            choice = sc.nextLine();
        }
        if (choice.equals("n")) {
            if (newGame()) {
                return 1;
            } else {
                return 0;
            }
        }
        if (exitGame()) {
            return -1;
        } else {
            return 0;
        }
    }

}
