package com.kodilla.rps;

public class Messages {

    private String openGame = "Gra w papier, kamień, nożyce \n";
    private String startGame = "Obsługa gry:\n" +
            "klawisz 1 – zagranie \"kamień\",\n" +
            "klawisz 2 – zagranie \"papier\",\n" +
            "klawisz 3 – zagranie \"nożyce\",\n" +
            "klawisz x – zakończenie gry,\n" +
            "klawisz n – uruchomienie gry od nowa. \n";
    private String errorFormat = "Błędny format\n";
    private String reminder = "Wybierz cyfrę 1 (kamień), 2 (papier) lub 3 (nożyce).\n";
    private String yourName = "Podaj swoje imię:";
    private String yourMove = "Wybierz swój ruch:";
    private String numbRounds = "Podaj liczbę rund:";
    private String userMove = "Wybrałeś: ";
    private String compMove = "Oto jak zagrał Twój rywal: ";
    private String paper = "Papier";
    private String scissors = "Nożyczki";
    private String rock = "Kamień";
    private String resultWinUser = "Wygrałeś tę rundę. 1 punkt dla Ciebie\n";
    private String resultWinCom = "Tę rundę wygrał przeciwnik. 1 punkt dla niego\n";
    private String resultTie = "Remis, każdy otrzymuje 1 punkt\n";
    private String actualResult = "Aktualny wynik: \n";
    private String nextRound = "Runda nr: ";
    private String endGame = "Koniec gry. Wygrał: ";
    private String draw = "Koniec gry. Mamy remis";
    private String finishChoice = "Jeśli chcesz grać od nowa, naciśnij n'\n" +
            "Jeśli chcesz zakończyć, wciśnij x";
    private String closeProgram = "Dziękuję za grę, do zobaczenia!";
    private String confidenceEnds = "Czy na pewno chcesz zakończyć grę? (t/n)";
    private String confidenceNewRound = "Czy na pewno chcesz zacząć grę od nowa? (t/n)";
    private String resultOfGame = "Ostateczny wynik gry: \n";
    public String userMove(int userMove) {
        return this.userMove + User.chosenMove(userMove);
    }
    public String getOpenGame() {
        return openGame;
    }

    public String getStartGame() {
        return startGame;
    }

    public String getYourMove() {
        return yourMove;
    }

    public String getCompMove() {
        return compMove;
    }

    public String getPaper() {
        return paper;
    }

    public String getScissors() {
        return scissors;
    }

    public String getRock() {
        return rock;
    }

    public String getResultWinUser() {
        return resultWinUser;
    }

    public String getResultWinCom() {
        return resultWinCom;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getNextRound() {
        return nextRound;
    }

    public String getEndGame() {
        return endGame;
    }

    public String getFinishChoice() {
        return finishChoice;
    }

    public String getResultTie() {
        return resultTie;
    }

    public String getNumbRounds() {
        return numbRounds;
    }

    public String getDraw() {
        return draw;
    }

    public String getYourName() {
        return yourName;
    }

    public String getCloseProgram() {
        return closeProgram;
    }

    public String getConfidenceEnds() {
        return confidenceEnds;
    }

    public String getConfidenceNewRound() {
        return confidenceNewRound;
    }

    public String getReminder() {
        return reminder;
    }

    public String getErrorFormat() {
        return errorFormat;
    }

    public String getResultOfGame() {
        return resultOfGame;
    }
}
