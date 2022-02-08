package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) throws InterruptedException {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard sudokuBoard = new SudokuBoard();

            //gameFinished = sudokuBoard.fillBoard(filling);
            gameFinished = theGame.resolveSudoku(sudokuBoard);
//            gameFinished = true;
        }

    }

    private boolean resolveSudoku(SudokuBoard sudokuBoard) {
        System.out.println(sudokuBoard.toString());
        Scanner sc = new Scanner(System.in);

        String filling = null;
        while (!filling.equals("SUDOKU")) {
            System.out.println("Wypełnij pola podając x,y,wartość lub wpisz SUDOKU, aby rozwiązać:\n");
            filling = sc.nextLine();
            sudokuBoard.fillBoard(filling);
            System.out.println(sudokuBoard.toString());
        }

        sc.close();

        return true;
    }


}
