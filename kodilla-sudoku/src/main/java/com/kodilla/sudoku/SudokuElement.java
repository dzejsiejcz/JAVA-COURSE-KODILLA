package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value = EMPTY;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        for (int i = 1; i<10; i++) {
            possibleValues.add(i);
        }
    }




    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
