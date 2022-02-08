package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> listOfRows = new ArrayList<>();

    public SudokuBoard() {
        for (int i =0; i<9; i++){
            listOfRows.add(new SudokuRow());
        }
    }

    public boolean fillBoard(String filling) {
        // Creating array of string length
        char[] ch = new char[filling.length()];
        // Copy character by character into array
        for (int i = 0; i < filling.length(); i++) {
            ch[i] = filling.charAt(i);
        }
        int coordinateX = Character.getNumericValue(ch[0]);
        int coordinateY = Character.getNumericValue(ch[2]);
        int value = Character.getNumericValue(ch[4]);
        System.out.println("Wybrałeś x= " + coordinateX + "y " + coordinateY + "wartość " + value);

        listOfRows.get(coordinateY).getListOfElements().get(coordinateX).setValue(value);

        return false;
    }


    @Override
    public String toString() {

        String response = "                         SudokuBoard\n";
        String describCol = "      1     2     3      4     5     6      7     8     9\n";
        String dash = "   -------------------------------------------------------\n";
        String upDash = "   _______________________________________________________\n";
        response = response + describCol;
        for (int y=0; y<9; y++) {
            String row = "";
            if (y==3 || y==6 ) {
                row = row + upDash;
            }
            row = row + dash + (y+1) + "  ";
            SudokuRow sudokuRow = listOfRows.get(y);
            for (int x=0; x<9; x++) {
                int value = sudokuRow.getListOfElements().get(x).getValue();
                if (value==-1){
                    value = 0;
                }
                if (x==3 || x==6){
                    row = row + "||  " + value + "  ";
                } else {
                    row = row + "|  " + value + "  ";
                }
            }

            row = row + "\n";
            response = response + row;
        }

        response = response + dash;

        return response;
    }
}
