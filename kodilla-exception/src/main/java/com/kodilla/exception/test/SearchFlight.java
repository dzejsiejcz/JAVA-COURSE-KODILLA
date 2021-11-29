package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {


    public static String findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> isExistedFlight = new HashMap<>();

        String destination1 = flight.getArrivalAirport();
        isExistedFlight.put(destination1, true);

        if (isExistedFlight.get(flight.getArrivalAirport())==null) {
            throw new RouteNotFoundException();
        }
        return isExistedFlight.get(flight.getArrivalAirport()).toString();

    }

    public static void main (String[] args) {
        Flight flight1 = new Flight("Warsaw", "Gdansk");
        Flight flight2 = new Flight("Warsaw", "Radom");
        Flight flight3 = new Flight("Warsaw", "Berlin");
        Flight flight4 = new Flight("Wroclaw", "Gdansk");


        try {
            String airport = findFlight(flight1);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport dos not exist");
        }
    }
}
