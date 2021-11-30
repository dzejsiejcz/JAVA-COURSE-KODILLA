package com.kodilla.rps;

import static com.kodilla.rps.Messages.*;

public class Winner {
    private final RoundsCounter roundsCounter;
    private final User user;
    private final User comp;

    public Winner(RoundsCounter roundsCounter, User user, User comp) {
        this.roundsCounter = roundsCounter;
        this.user = user;
        this.comp = comp;
    }

    public String effect(int userMove, int compMove) {
        if (userMove == compMove) {
            return bothWins();
        } else if (userMove == 1) {
            if (compMove == 2) {
                return compWins();
            } else {
                return userWins();
            }
        } else if (userMove == 2) {
            if (compMove == 3) {
                return compWins();
            } else {
                return userWins();
            }
        } else if (userMove == 3) {
            if (compMove == 1) {
                return compWins();
            } else {
                return userWins();
            }
        }
        return REMINDER;
    }

    private String userWins () {
        user.add1Point();
        roundsCounter.add1FinishedRounds();
        return RESULT_WIN_USER;
    }

    private String compWins () {
        comp.add1Point();
        roundsCounter.add1FinishedRounds();
        return RESULT_WIN_COMP;
    }

    private String bothWins () {
        user.add1Point();
        comp.add1Point();
        roundsCounter.add1FinishedRounds();
        return RESULT_TIE;
    }
}
