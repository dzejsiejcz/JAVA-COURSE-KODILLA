package com.kodilla.rps;

import java.util.Scanner;
import static com.kodilla.rps.Messages.*;

// in this program, each Thread.sleep method is used for better readability

public class RpsRunner  {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println(OPEN_GAME + START_GAME);
        Thread.sleep(500);
        boolean toExit = false;
        while (!toExit) {
            Game game = new Game();
            int out = game.battle();
            if (out == -1) {
                toExit = true;
            } else if (out == 0) {
                int lastDecision = game.lastDecide();
                while (lastDecision == 0) {
                    lastDecision = game.lastDecide();
                }
                if (lastDecision == -1) {
                    toExit = true;
                }
            }
        }
        sc.close();
        System.out.println(CLOSE_PROGRAM);
    }
}
