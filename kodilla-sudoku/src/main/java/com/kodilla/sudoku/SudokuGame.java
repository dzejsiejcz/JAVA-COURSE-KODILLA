package com.kodilla.sudoku;

public class SudokuGame {




    public static void main(String[] args) throws InterruptedException {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }

    private boolean resolveSudoku() {
        return false;
    }


}
