package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.repository.Repository;
import com.kodilla.good.patterns.challenges.flights.request.FlightsRetriever;

import static com.kodilla.good.patterns.challenges.flights.request.FlightsRetriever.*;

public class ApplicationFlights {

    public static void main(String[] args) {

        FlightsRetriever flightsRetriever = new FlightsRetriever();
        Repository flights = flightsRetriever.retrieve();


        System.out.println("\n Next request \n");
        flights.getAirportArrivals(berlin);

        System.out.println("\n Next request \n");
        flights.getAirportDepartures(gdansk);

        System.out.println("\n Next request \n");
        flights.searchConnection(gdansk, paris);

        System.out.println("\n Next request \n");
        flights.isDirectlyConnection(wroclaw, paris);

        System.out.println("\n Next request \n");
        flights.isDirectlyConnection(paris, wroclaw);

        System.out.println("\n Next request \n");
        flights.searchConnection(paris, wroclaw);

        System.out.println("\n Next request \n");
        flights.searchConnection(wroclaw, warsaw);






    }

}
