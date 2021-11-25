package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner  {

    public static void main(String[] args) throws InterruptedException {

        Messages m = new Messages();
        Scanner sc = new Scanner(System.in);
        System.out.println(m.getOpenGame() + m.getStartGame());
        Thread.sleep(500);
        String choice = "n";
        while (choice.equals("n")){
            Game game = new Game();
            int out = game.battle();
            if (out==-1){
                System.out.println(m.getCloseProgram());
                return;
            } else if (out==1){
                choice="n";
            } else if (out==0) {
                System.out.println(m.getFinishChoice());
                choice = sc.nextLine();
            }
        }
        sc.close();
        System.out.println(m.getCloseProgram());
    }
}
