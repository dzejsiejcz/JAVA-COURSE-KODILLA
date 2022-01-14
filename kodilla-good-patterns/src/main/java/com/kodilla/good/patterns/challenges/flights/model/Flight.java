package com.kodilla.good.patterns.challenges.flights.model;

import java.time.LocalTime;

public class Flight {

    private final Airport from;
    private final Airport to;
    private final LocalTime departureTime;

    public Flight(Airport from, Airport to, LocalTime departureTime) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getFrom().equals(flight.getFrom())) return false;
        if (!getTo().equals(flight.getTo())) return false;
        return getDepartureTime().equals(flight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        int result = getFrom().hashCode();
        result = 31 * result + getTo().hashCode();
        result = 31 * result + getDepartureTime().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from +
                ", to=" + to +
                ", departureTime=" + departureTime +
                '}';
    }
}
