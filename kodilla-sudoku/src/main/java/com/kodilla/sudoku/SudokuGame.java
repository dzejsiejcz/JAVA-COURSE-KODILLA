package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {

    public static List<SudokuGuessingElement> backtrack = new ArrayList<>();
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws CloneNotSupportedException {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard sudokuBoard = new SudokuBoard();
            gameFinished = theGame.playSudoku(sudokuBoard);
        }
        sc.close();
    }

    private boolean playSudoku(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        System.out.println(sudokuBoard.toString());
        String filling = "";
         do {

            System.out.println("Wypełnij pola podając x,y,wartość lub wpisz SUDOKU, aby rozwiązać:\n");
            filling = sc.nextLine();
            if (filling.equalsIgnoreCase("SUDOKU")){
                break;
            }
            if (sudokuBoard.fillBoard(filling)) {
                System.out.println(sudokuBoard);
            }
        }
        while(true);

        boolean isSolved;

        do {
            isSolved = sudokuBoard.solveSudoku();
            if (isSolved) {
                System.out.println("Rozwiązane");
                System.out.println(sudokuBoard);
            } else {
                System.out.println("Mamy błąd");
                System.out.println(sudokuBoard);
                if (!backtrack.isEmpty()) {
                    SudokuGuessingElement sudokuGuessingElement = backtrack.get(backtrack.size()-1);
                    sudokuBoard = sudokuGuessingElement.getDeepCopy();
                    int col = sudokuGuessingElement.getCol();
                    int row = sudokuGuessingElement.getRow();
                    int val = sudokuGuessingElement.getGuessingValue();
                    sudokuBoard.getListOfRows().get(row).getListOfElements().get(col).getPossibleValues().remove(val);
                } else {
                    System.out.println("Nie można rozwiązac SUDOKU");
                    return true;
                }
            }
        }
        while (!isSolved);


        return true;
    }
}
