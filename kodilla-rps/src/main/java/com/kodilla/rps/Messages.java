package com.kodilla.rps;

public class Messages {

    public static final String OPEN_GAME = "Gra w papier, kamień, nożyce \n";
    public static final String START_GAME = "Obsługa gry:\n" + "klawisz 1 – zagranie \"kamień\",\n" + "klawisz 2 – zagranie \"papier\",\n" + "klawisz 3 – zagranie \"nożyce\",\n" + "klawisz x – zakończenie gry,\n" + "klawisz n – uruchomienie gry od nowa. \n";
    public static final String ERROR_FORMAT = "Błędna liczba rund\n";
    public static final String REMINDER = "Wybierz cyfrę 1 (kamień), 2 (papier) lub 3 (nożyce).\n";
    public static final String NEW_GAME = "Zaczynamy nową grę\n";
    public static final String YOUR_NAME = "Podaj swoje imię:";
    public static final String YOUR_MOVE = "Wybierz swój ruch:";
    public static final String NUMB_ROUNDS = "Podaj liczbę rund:";
    public static final String USER_MOVE = "Wybrałeś: ";
    public static final String BAD_CHOICE = "Wybrałeś niepoprawnie, powtórz swój wybór";

    public static final String BACK_TO_GAME = "OK, wracamy do gry i powtórzymy aktualną rundę";
    public static final String COMP_MOVE = "Oto jak zagrał Twój rywal: ";
    public static final String PAPER = "Papier";
    public static final String SCISSORS = "Nożyczki";
    public static final String ROCK = "Kamień";
    public static final String RESULT_WIN_USER = "Wygrałeś tę rundę. 1 punkt dla Ciebie\n";
    public static final String RESULT_WIN_COMP = "Tę rundę wygrał przeciwnik. 1 punkt dla niego\n";
    public static final String RESULT_TIE = "Remis, każdy otrzymuje 1 punkt\n";
    public static final String ACTUAL_RESULT = "Aktualny wynik: \n";
    public static final String NEXT_ROUND = "Runda nr: ";
    public static final String END_GAME = "Koniec gry. Wygrał: ";
    public static final String DRAW = "Koniec gry. Mamy remis";
    public static final String FINISH_CHOICE = "Jeśli chcesz grać od nowa, naciśnij n\n" + "Jeśli chcesz zakończyć, wciśnij x";
    public static final String CLOSE_PROGRAM = "Dziękuję za grę, do zobaczenia!";
    public static final String CONFIDENCE_ENDS = "Czy na pewno chcesz zakończyć grę? (t/n)";
    public static final String CONFIDENCE_NEW_GAME = "Czy na pewno chcesz zacząć grę od nowa? (t/n)";
    public static final String RESULT_OF_GAME = "Ostateczny wynik gry: \n";

    public static String userMove(int userMove) {
        return USER_MOVE + User.chosenMove(userMove);
    }

}
