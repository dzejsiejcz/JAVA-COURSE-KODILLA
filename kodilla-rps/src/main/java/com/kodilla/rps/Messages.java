package com.kodilla.rps;

public class Messages {

    private final String OPEN_GAME = "Gra w papier, kamień, nożyce \n";
    private final String START_GAME = "Obsługa gry:\n" +
            "klawisz 1 – zagranie \"kamień\",\n" +
            "klawisz 2 – zagranie \"papier\",\n" +
            "klawisz 3 – zagranie \"nożyce\",\n" +
            "klawisz x – zakończenie gry,\n" +
            "klawisz n – uruchomienie gry od nowa. \n";
    private final String ERROR_FORMAT = "Błędny format\n";
    private final String REMINDER = "Wybierz cyfrę 1 (kamień), 2 (papier) lub 3 (nożyce).\n";
    private final String YOUR_NAME = "Podaj swoje imię:";
    private final String YOUR_MOVE = "Wybierz swój ruch:";
    private final String NUMB_ROUNDS = "Podaj liczbę rund:";
    private final String USER_MOVE = "Wybrałeś: ";
    private final String COMP_MOVE = "Oto jak zagrał Twój rywal: ";
    private final String PAPER = "Papier";
    private final String SCISSORS = "Nożyczki";
    private final String ROCK = "Kamień";
    private final String RESULT_WIN_USER = "Wygrałeś tę rundę. 1 punkt dla Ciebie\n";
    private final String RESULT_WIN_COMP = "Tę rundę wygrał przeciwnik. 1 punkt dla niego\n";
    private final String RESULT_TIE = "Remis, każdy otrzymuje 1 punkt\n";
    private final String ACTUAL_RESULT = "Aktualny wynik: \n";
    private final String NEXT_ROUND = "Runda nr: ";
    private final String END_GAME = "Koniec gry. Wygrał: ";
    private final String DRAW = "Koniec gry. Mamy remis";
    private final String FINISH_CHOICE = "Jeśli chcesz grać od nowa, naciśnij n\n" +
            "Jeśli chcesz zakończyć, wciśnij x";
    private final String CLOSE_PROGRAM = "Dziękuję za grę, do zobaczenia!";
    private final String CONFIDENCE_ENDS = "Czy na pewno chcesz zakończyć grę? (t/n)";
    private final String CONFIDENCE_NEW_GAME = "Czy na pewno chcesz zacząć grę od nowa? (t/n)";
    private final String RESULT_OF_GAME = "Ostateczny wynik gry: \n";

    public String userMove(int userMove) {
        return this.USER_MOVE + User.chosenMove(userMove);
    }

    public String getOPEN_GAME() {
        return OPEN_GAME;
    }

    public String getSTART_GAME() {
        return START_GAME;
    }

    public String getYOUR_MOVE() {
        return YOUR_MOVE;
    }

    public String getCOMP_MOVE() {
        return COMP_MOVE;
    }

    public String getPAPER() {
        return PAPER;
    }

    public String getSCISSORS() {
        return SCISSORS;
    }

    public String getROCK() {
        return ROCK;
    }

    public String getRESULT_WIN_USER() {
        return RESULT_WIN_USER;
    }

    public String getRESULT_WIN_COMP() {
        return RESULT_WIN_COMP;
    }

    public String getACTUAL_RESULT() {
        return ACTUAL_RESULT;
    }

    public String getNEXT_ROUND() {
        return NEXT_ROUND;
    }

    public String getEND_GAME() {
        return END_GAME;
    }

    public String getFINISH_CHOICE() {
        return FINISH_CHOICE;
    }

    public String getRESULT_TIE() {
        return RESULT_TIE;
    }

    public String getNUMB_ROUNDS() {
        return NUMB_ROUNDS;
    }

    public String getDRAW() {
        return DRAW;
    }

    public String getYOUR_NAME() {
        return YOUR_NAME;
    }

    public String getCLOSE_PROGRAM() {
        return CLOSE_PROGRAM;
    }

    public String getCONFIDENCE_ENDS() {
        return CONFIDENCE_ENDS;
    }

    public String getCONFIDENCE_NEW_GAME() {
        return CONFIDENCE_NEW_GAME;
    }

    public String getREMINDER() {
        return REMINDER;
    }

    public String getERROR_FORMAT() {
        return ERROR_FORMAT;
    }

    public String getRESULT_OF_GAME() {
        return RESULT_OF_GAME;
    }
}
