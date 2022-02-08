package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> listOfElements = new ArrayList<>();

    public SudokuRow() {
        for (int i =0; i<9; i++){
            listOfElements.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getListOfElements() {
        return listOfElements;
    }

    public void setListOfElements(List<SudokuElement> listOfElements) {
        this.listOfElements = listOfElements;
    }
}
