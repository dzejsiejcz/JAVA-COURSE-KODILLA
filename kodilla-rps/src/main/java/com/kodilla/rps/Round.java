package com.kodilla.rps;

public class Round {
    private final Messages m = new Messages();
    private final RoundsCounter roundsCounter;
    private final User user;
    private final User comp;

    public Round(RoundsCounter roundsCounter, User user, User comp) {
        this.roundsCounter = roundsCounter;
        this.user = user;
        this.comp = comp;
    }

    public String effect(int userMove, int compMove) {
        if (userMove == compMove) {
            bothWins();
        } else if (userMove == 1) {
            if (compMove == 2) {
                compWins();
            } else {
                userWins();
            }
        } else if (userMove == 2) {
            if (compMove == 3) {
                compWins();
            } else {
                userWins();
            }
        } else if (userMove == 3) {
            if (compMove == 1) {
                compWins();
            } else {
                userWins();
            }
        }
        return m.getREMINDER();
    }

    private String userWins () {
        user.add1Point();
        roundsCounter.add1FinishedRounds();
        return m.getRESULT_WIN_USER();
    }

    private String compWins () {
        comp.add1Point();
        roundsCounter.add1FinishedRounds();
        return m.getRESULT_WIN_COMP();
    }

    private String bothWins () {
        user.add1Point();
        comp.add1Point();
        roundsCounter.add1FinishedRounds();
        return m.getRESULT_TIE();
    }
}
