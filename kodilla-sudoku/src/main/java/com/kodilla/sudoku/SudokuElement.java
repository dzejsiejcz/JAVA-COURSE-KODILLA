package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value = EMPTY;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement(int value, List<Integer> possibleValues) {
        this.value = value;
        this.possibleValues = possibleValues;
    }
}
