package com.kodilla.good.patterns.challenges.flights.repository;

import com.kodilla.good.patterns.challenges.flights.model.Airport;
import com.kodilla.good.patterns.challenges.flights.model.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class Repository {

    private final List<Flight> flights;

    public Repository(List <Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Airport> getAirportArrivals(Airport airport) {

        List<Airport> airports = flights.stream()
                .filter(flight -> flight.getTo().equals(airport))
                .map(Flight::getFrom)
                .collect(Collectors.toList());

        String textMessage = "Arrivals to ";
        printResult(airport, airports, textMessage);

        return airports;
    }

    public List<Airport> getAirportDepartures(Airport airport) {

        List<Airport> airports = flights.stream()
                .filter(flight -> flight.getFrom().equals(airport))
                .map(Flight::getTo)
                .collect(Collectors.toList());

        String textMessage = "Departures from ";
        printResult(airport, airports, textMessage);

        return airports;
    }

    public List<Flight> getFlightsWithDepartureTo(Airport airport) {
        return flights.stream()
                .filter(flight -> flight.getTo().equals(airport))
                .collect(Collectors.toList());
    }


    public List<Flight> getFlightsWithArrivalFrom(Airport airport) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(airport))
                .collect(Collectors.toList());
    }

    public void isDirectlyConnection (Airport from, Airport to) {
        Optional<Flight> optionalFlight = flights.stream()
                .filter(flight -> flight.getFrom().equals(from) && flight.getTo().equals(to))
                .findFirst();

        optionalFlight.ifPresent(flight -> System.out.println("Requested direct flight from: " + from + " to: " + to + " exists. \n" +
                "Schedule time: " + flight.getDepartureTime()));

        System.out.println("Requested direct flight from: " + from + " to: " + to + " does not exist \n");
    }

    public void searchConnection(Airport from, Airport to) {

        isDirectlyConnection(from, to);

        Map<String, List<Flight>> travels = new HashMap<>();

        List<Flight> flightsFromStart = getFlightsWithArrivalFrom(from);
        List<Flight> flightsToFinalDestination = getFlightsWithDepartureTo(to);
        List<Airport> destinationsFromStartAirport = getAirportDepartures(from);
        List<Airport> arrivalsToFinalDestinations = getAirportArrivals(to);

        int counter = 1;
        for (Airport destinationToChange : destinationsFromStartAirport) {
            for (Airport arrivalFromChange : arrivalsToFinalDestinations) {
                if (destinationToChange.equals(arrivalFromChange)) {
                    List<Flight> result = new ArrayList<>();
                    Optional<Flight> firstFlight = flightsFromStart.stream()
                            .filter(flight1 -> flight1.getTo().equals(destinationToChange))
                            .findFirst();
                    firstFlight.ifPresent(result::add);


                    Optional <Flight> flightAfterChange = flightsToFinalDestination.stream()
                            .filter(flight -> flight.getFrom().equals(arrivalFromChange))
                            .findFirst();
                    flightAfterChange.ifPresent(result::add);

                    String description = "Journey " + counter + " from " + from.toString()
                            + " to " + to.toString() + " through " + destinationToChange + "\n";
                    travels.put(description, result);
                    counter++;

                }
            }
        }
        travels.forEach((key, value) -> System.out.println("Available " + key + " with one transfer: " + value.toString() + "\n"));

        if (travels.isEmpty()) {
            System.out.println("There is no connection with change between " + from.toString() + " and " + to.toString() + "\n");
        }

    }



    private void printResult(Airport requestedAirport, List<Airport> airports, String textMessage) {
        String printFlights = airports.stream()
                .map(Airport::toString)
                .collect(Collectors.joining(",\n", textMessage + requestedAirport + ":\n", "\n"));
        System.out.println(printFlights);
    }

}
