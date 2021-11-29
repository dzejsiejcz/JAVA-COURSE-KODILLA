package com.kodilla.exception.test;

public class FlightsRunner {

    public static void main (String[] args) {
        Flight flight1 = new Flight("Warsaw", "Gdansk");
        Flight flight2 = new Flight("Warsaw", "Radom");
        Flight flight3 = new Flight("Gdansk", "Warsaw");


        SearchFlight searchFlight = new SearchFlight();

        try {
            System.out.println("Arrival airport in this flight is opened?: " + searchFlight.isOpen(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: Arrival airport dos not exist");
        }

        // this try-catch will throw exception
        try {
            System.out.println("Arrival airport in this flight is opened?: " + searchFlight.isOpen(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: Arrival airport dos not exist");
        }

        try {
            System.out.println("Arrival airport in this flight is opened?: " + searchFlight.isOpen(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: Arrival airport dos not exist");
        }
    }
}
