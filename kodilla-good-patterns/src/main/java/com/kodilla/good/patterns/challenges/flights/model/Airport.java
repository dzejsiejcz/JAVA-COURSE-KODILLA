package com.kodilla.good.patterns.challenges.flights.model;

public class Airport {

    private final String name;

    public Airport(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Airport " + name;
    }
}
