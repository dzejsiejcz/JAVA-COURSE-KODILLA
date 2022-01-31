package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> listOfRows = new ArrayList<>();


    @Override
    public String toString() {

        String response = "SudokuBoard\n";
        String describCol = "      1     2     3     4     5     6     7     8     9\n";
        String dash = "   -------------------------------------------------------\n";
        response = response + describCol;
        for (int y=0; y<9; y++) {
            String row = "";
            row = row + dash + String.valueOf(y+1) + "  ";
            for (int x=0; x<10; x++) {
                row = new StringBuilder().append(row).append("|     ").toString();
            }
            row = row + "\n";
            response = response + row;
        }

        response = response + dash;

        return response;
    }
}
