package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner  {

    public static void main(String[] args) throws InterruptedException {

        Messages m = new Messages();
        Scanner sc = new Scanner(System.in);
        System.out.println(m.getOPEN_GAME() + m.getSTART_GAME());
        Thread.sleep(500);
        String choice = "n";
        while (choice.equals("n")){
            Game game = new Game();
            int out = game.battle();
            if (out==-1){
                System.out.println(m.getCLOSE_PROGRAM());
                return;
            } else if (out==1){
                choice="n";
            } else if (out==0) {
                System.out.println(m.getFINISH_CHOICE());
                choice = sc.nextLine();
            }
        }
        sc.close();
        System.out.println(m.getCLOSE_PROGRAM());
    }
}
