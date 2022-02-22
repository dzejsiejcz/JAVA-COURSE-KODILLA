package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard sudokuBoard = new SudokuBoard();
            gameFinished = theGame.playSudoku(sudokuBoard);
        }
        sc.close();
    }

    private boolean playSudoku(SudokuBoard sudokuBoard) {
        System.out.println(sudokuBoard.toString());
        String filling = "";
         do {
             filling = "";
            System.out.println("Wypełnij pola podając x,y,wartość lub wpisz SUDOKU, aby rozwiązać:\n");
            filling = sc.nextLine();
            if (filling.equalsIgnoreCase("SUDOKU")){
                break;
            }
            if (sudokuBoard.fillBoard(filling)) {
                System.out.println(sudokuBoard);
            }
        }
        while(!filling.equalsIgnoreCase("SUDOKU"));

        boolean isSolved = sudokuBoard.solveSudoku();

        if (isSolved) {
            System.out.println(sudokuBoard);
        } else {
            System.out.println(false);
        }

        return true;
    }
}
