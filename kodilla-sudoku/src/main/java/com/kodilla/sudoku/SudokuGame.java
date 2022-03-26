package com.kodilla.sudoku;

import static com.kodilla.sudoku.Constants.SUDOKU;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {

    public static List<SudokuGuessingElement> backtrack = new ArrayList<>();
    private final static Scanner sc = new Scanner(System.in);
    private SudokuBoard sudokuBoard = new SudokuBoard();
    PresetsForBoard presetsForBoard = new PresetsForBoard();

    public static void play() throws CloneNotSupportedException {

        boolean gameFinished = false;
        SudokuGame sudokuGame = new SudokuGame();




        while (!gameFinished) {
            gameFinished = sudokuGame.playSudoku();
        }
        sc.close();
    }

    private boolean playSudoku() throws CloneNotSupportedException {

        //sudokuBoard.automaticallyFillBoardFromPreset(presetsForBoard);
        sudokuBoard.randomFillBoard();
        System.out.println(sudokuBoard.toString());

        handFill();

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
                    SudokuGuessingElement sudokuGuessingElement = backtrack.get(backtrack.size() - 1);
                    sudokuBoard = sudokuGuessingElement.getDeepCopy();
                    int col = sudokuGuessingElement.getCol();
                    int row = sudokuGuessingElement.getRow();
                    int val = sudokuGuessingElement.getGuessingValue();
                    removeValue(col, row, val);
                } else {
                    System.out.println("Nie można rozwiązac SUDOKU");
                    return true;
                }
            }
        }
        while (!isSolved);

        return true;
    }

    private void removeValue(int col, int row, int val) {
        sudokuBoard.getListOfRows().get(row)
                .getListOfElements().get(col)
                .getPossibleValues().remove(val);
    }

    private void handFill() {
        while(true) {
            System.out.println("Wypełnij pola podając x,y,wartość lub wpisz SU, aby rozwiązać:\n");
            String filling = sc.nextLine();
            if (filling.equalsIgnoreCase(SUDOKU)) {
                break;
            }

            if (sudokuBoard.fillBoard(filling)) {
                System.out.println(sudokuBoard);
            }
        }
    }
}
