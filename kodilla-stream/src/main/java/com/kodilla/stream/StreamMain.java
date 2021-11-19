package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tekst do upiększenia", text -> text.toUpperCase());
        poemBeautifier.beautify("tekst do upiększenia", text -> text + " końcówka.");
        poemBeautifier.beautify("tekst do upiększenia", text -> text.replaceFirst("ks", "x"));
    }
}
