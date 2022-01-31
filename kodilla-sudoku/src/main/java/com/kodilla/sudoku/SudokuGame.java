package com.kodilla.sudoku;

public class SudokuGame {




    public static void main(String[] args) throws InterruptedException {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
            String print = new SudokuBoard().toString();
            System.out.println(print);
            gameFinished = true;
        }
    }

    private boolean resolveSudoku() {
        return false;
    }


}
