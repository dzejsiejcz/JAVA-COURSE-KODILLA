package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final String name;
    private final List<Country> theListOfCountries;

    public Continent(final String name, final List<Country> theListOfCountries) {
        this.name = name;
        this.theListOfCountries = theListOfCountries;
    }

    public List<Country> getTheListOfCountries() {
        return theListOfCountries;
    }

}
