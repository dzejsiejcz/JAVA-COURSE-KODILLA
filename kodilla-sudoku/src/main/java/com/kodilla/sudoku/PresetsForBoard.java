package com.kodilla.sudoku;

public class PresetsForBoard {

    public static int [][] values = new int [9][9];

    public PresetsForBoard() {
        values[0][0] = 1;
        values[3][0] = 9;
        values[5][0] = 2;
        values[8][0] = 3;
        values[0][1] = 6;
        values[1][1] = 7;
        values[2][1] = 3;
        values[4][1] = 8;
        values[5][1] = 5;
        values[7][1] = 9;
        values[2][2] = 8;
        values[4][2] = 7;
        values[6][2] = 6;
        values[7][2] = 1;
        values[8][2] = 5;
        values[3][3] = 7;
        values[4][3] = 5;
        values[7][3] = 6;
        values[0][4] = 5;
        values[1][4] = 1;
        values[2][4] = 7;
        values[3][4] = 4;
        values[4][4] = 9;
        values[6][4] = 3;
        values[7][4] = 2;
        values[8][4] = 8;
        values[0][5] = 9;
        values[6][5] = 4;
        values[2][6] = 2;
        values[4][6] = 3;
        values[5][6] = 1;
        values[7][6] = 4;
        values[8][6] = 9;
        values[1][7] = 8;
        values[7][7] = 7;
        values[8][7] = 2;
        values[0][8] = 4;
        values[7][8] = 3;
    }

    public int getValues(int col, int row) {
        return values[col][row];
    }
}
