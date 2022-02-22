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

    public boolean isInscribedInRow(final int requestedValue) {
        Integer possible = listOfElements.stream()
                .map(e -> e.getValue())
                .filter(s -> s==requestedValue)
                .findFirst()
                .orElse(null);

        if (possible!=null) {
            return true;
        }
        return false;
    }

    public boolean isInPossibleValuesInRow (final int requestedValue) {

        Integer possible = listOfElements.stream()
                .flatMap(sudokuElement -> sudokuElement.getPossibleValues().stream())
                .filter(element -> element==requestedValue)
                .findAny().orElse(null);

        if (possible!=null) {
            return true;
        }
        return false;
    }


}
