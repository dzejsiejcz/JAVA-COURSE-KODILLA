package com.kodilla.rps;

import java.util.List;

public class RoundsCounter {

    private int numbOfRounds;
    private int finishedRounds = 0;

    public int getFinishedRounds() {
        return finishedRounds;
    }

    public RoundsCounter(int numbOfRounds) {
        this.numbOfRounds = numbOfRounds;
    }

    public boolean isFinishedGame() {
        return finishedRounds == numbOfRounds;
    }

    public void add1FinishedRounds() {
        this.finishedRounds +=1;
    }
}
