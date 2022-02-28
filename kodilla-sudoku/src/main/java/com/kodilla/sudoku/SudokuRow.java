package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.Statics.DIMENSION_OF_TABLE;
import static com.kodilla.sudoku.SudokuBoard.*;

public class SudokuRow {

    private List<SudokuElement> listOfElements = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i< DIMENSION_OF_TABLE; i++){
            listOfElements.add(new SudokuElement());
        }
    }

    public SudokuRow(boolean isCopy) {

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

        return possible != null;

    }

    public boolean isInPossibleValuesInRow (final int requestedValue) {

        Integer possible = listOfElements.stream()
                .flatMap(sudokuElement -> sudokuElement.getPossibleValues().stream())
                .filter(element -> element==requestedValue)
                .findAny().orElse(null);

        return possible != null;
    }


}
