package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value = EMPTY;
    private Set<Integer> possibleValues = new HashSet<>();

    public SudokuElement() {
        for (int i = 1; i<10; i++) {
            possibleValues.add(i);
        }
    }

    public SudokuElement(int value) {
        this.value = value;
    }




    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(Set<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
