package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private boolean isFinished = false;
    private final Scanner sc = new Scanner(System.in);
    private final Messages m = new Messages();
    private final User comp1 = new User("Komputer");

    public int battle() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println(m.getYOUR_NAME());
        String name = sc.nextLine();
        User user = new User(name);
        int rounds = 1;
        boolean check = true;
        do {
            System.out.println(m.getNUMB_ROUNDS());
            try {
                rounds = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println(m.getERROR_FORMAT());
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
        while (!isFinished) {

            int counterRounds = roundsCounter.getFinishedRounds()+1;
            System.out.println(m.getNEXT_ROUND() + counterRounds);
            Thread.sleep(2000);

            System.out.println(m.getYOUR_MOVE());
            choice = sc.nextLine();

            if (!(isNumeric(choice))) {
                if (choice.equals("x")) {
                    System.out.println(m.getCONFIDENCE_ENDS());
                    approval = sc.nextLine();
                    if (approval.equals("t")) {
                        return -1;
                    } else {
                        choice = "4";
                    }
                } else if (choice.equals("n")) {
                    System.out.println(m.getCONFIDENCE_NEW_GAME());
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
            isFinished = roundsCounter.isFinishedGame();
            Thread.sleep(2000);
            if (!isFinished) {
                System.out.println(m.getACTUAL_RESULT() + user.getName() + ": " + user.getPoints() +
                        "\n" + comp1.getName() + ": " + comp1.getPoints() + "\n");
                Thread.sleep(2000);
            }
        }
        Thread.sleep(2000);
        if (user.getPoints() == comp1.getPoints()) {
            System.out.println(m.getDRAW());
        } else if (user.getPoints() > comp1.getPoints()) {
            System.out.println(m.getEND_GAME() + user.getName());
        } else {
            System.out.println(m.getEND_GAME() + comp1.getName());
        }
        Thread.sleep(2000);
        System.out.println(m.getRESULT_OF_GAME() + user.getName() + ": " + user.getPoints() +
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
