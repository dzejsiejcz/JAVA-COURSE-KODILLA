package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard sudokuBoard = new SudokuBoard();
            gameFinished = theGame.resolveSudoku(sudokuBoard);
        }
        sc.close();
    }

    private boolean resolveSudoku(SudokuBoard sudokuBoard) {
        System.out.println(sudokuBoard.toString());
        String filling = "";
        while(!filling.equals("SUDOKU")) {
            filling = "";
            System.out.println("Wypełnij pola podając x,y,wartość lub wpisz SUDOKU, aby rozwiązać:\n");
            filling = sc.nextLine();
            if (sudokuBoard.fillBoard(filling)) {
                System.out.println(sudokuBoard);
            }
        }

        return true;
    }
}
