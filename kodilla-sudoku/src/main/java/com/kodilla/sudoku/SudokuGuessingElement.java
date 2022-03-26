package com.kodilla.sudoku;

public class SudokuGuessingElement {

    private SudokuBoard deepCopy;
    private int col;
    private int row;
    private int guessingValue;

    public SudokuGuessingElement(SudokuBoard deepCopy, int col, int row, int guessingValue) {
        this.deepCopy = deepCopy;
        this.col = col;
        this.row = row;
        this.guessingValue = guessingValue;
    }

    public SudokuBoard getDeepCopy() {
        return deepCopy;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getGuessingValue() {
        return guessingValue;
    }
}
