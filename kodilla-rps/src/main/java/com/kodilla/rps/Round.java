package com.kodilla.rps;

public class Round {
    private Messages m = new Messages();
    private RoundsCounter roundsCounter;
    private User user;
    private User comp;

    public Round(RoundsCounter roundsCounter, User user, User comp) {
        this.roundsCounter = roundsCounter;
        this.user = user;
        this.comp = comp;
    }

    public String effect(int userMove, int compMove) {

        if (userMove == compMove) {
            user.add1Point();
            comp.add1Point();
            roundsCounter.add1FinishedRounds();
            return m.getResultTie();
        } else if (userMove == 1) {
            if (compMove == 2) {
                comp.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinCom();
            } else {
                user.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinUser();
            }
        } else if (userMove == 2) {
            if (compMove == 3) {
                comp.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinCom();
            } else {
                user.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinUser();
            }
        } else if (userMove == 3) {
            if (compMove == 1) {
                comp.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinCom();
            } else {
                user.add1Point();
                roundsCounter.add1FinishedRounds();
                return m.getResultWinUser();
            }
        }
        return m.getReminder();
    }
}
