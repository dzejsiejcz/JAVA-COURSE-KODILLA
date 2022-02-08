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
        String upDash = "   _______________________________________________________\n";
        response = response + describCol;
        for (int y=0; y<9; y++) {
            String row = "";
            if (y==3 || y==6 ) {
                row = row + upDash;
            }
            row = row + dash + (y+1) + "  ";

            for (int x=0; x<10; x++) {
                if (x==3 || x==6){
                    row = row + "||    ";
                } else {
                    row = row + "|     ";
                }

            }
            row = row + "\n";
            response = response + row;
        }

        response = response + dash;

        return response;
    }
}
