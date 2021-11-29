package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    private  Map<String, Boolean> openAirports = new HashMap<>();

    public SearchFlight() {
        openAirports.put("Warsaw", true);
        openAirports.put("Gdansk", false);
    }

    public boolean isOpen(Flight flight) throws RouteNotFoundException {

        if (!(openAirports.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException();
        }
        return openAirports.get(flight.getArrivalAirport());
    }
}
