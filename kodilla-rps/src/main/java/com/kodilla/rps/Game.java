package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private boolean end = false;
    private final Scanner sc = new Scanner(System.in);
    private final Messages m = new Messages();
    private final User comp1 = new User("Komputer");

    public int battle() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println(m.getYourName());
        String name = sc.nextLine();
        User user = new User(name);
        int rounds = 1;
        boolean check = true;
        do {
            System.out.println(m.getNumbRounds());
            try {
                rounds = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println(m.getErrorFormat());
                sc.next();
            }
        }
        while (check);
        RoundsCounter roundsCounter = new RoundsCounter(rounds);
        Round round = new Round(roundsCounter, user, comp1);
        sc.nextLine();
        Thread.sleep(2000);
        String choice;
        String approval;

        //processing rounds
        while (!end) {

            int counterRounds = roundsCounter.getFinishedRounds()+1;
            System.out.println(m.getNextRound() + counterRounds);
            Thread.sleep(2000);

            System.out.println(m.getYourMove());
            choice = sc.nextLine();

            if (!(isNumeric(choice))) {
                if (choice.equals("x")) {
                    System.out.println(m.getConfidenceEnds());
                    approval = sc.nextLine();
                    if (approval.equals("t")) {
                        return -1;
                    } else {
                        choice = "4";
                    }
                } else if (choice.equals("n")) {
                    System.out.println(m.getConfidenceNewRound());
                    approval = sc.nextLine();
                    if (approval.equals("t")) {
                        return 1;
                    } else {
                        choice = "4";
                    }
                } else {
                    choice = "4";
                }
            }
            int userMove = Integer.parseInt(choice);

            System.out.println(m.userMove(userMove));
            Thread.sleep(2000);
            System.out.println(round.effect(userMove, comp1.randomMove()));
            end = roundsCounter.isFinishedGame();
            Thread.sleep(2000);
            if (!end) {
                System.out.println(m.getActualResult() + user.getName() + ": " + user.getPoints() +
                        "\n" + comp1.getName() + ": " + comp1.getPoints() + "\n");
                Thread.sleep(2000);
            }
        }
        Thread.sleep(2000);
        if (user.getPoints() == comp1.getPoints()) {
            System.out.println(m.getDraw());
        } else if (user.getPoints() > comp1.getPoints()) {
            System.out.println(m.getEndGame() + user.getName());
        } else {
            System.out.println(m.getEndGame() + comp1.getName());
        }
        Thread.sleep(2000);
        System.out.println(m.getResultOfGame() + user.getName() + ": " + user.getPoints() +
                "\n" + comp1.getName() + ": " + comp1.getPoints()+ "\n");
        Thread.sleep(3000);
        return 0;
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
