package com.kodilla.good.patterns.challenges.flights.request;

import com.kodilla.good.patterns.challenges.flights.model.Airport;
import com.kodilla.good.patterns.challenges.flights.model.Flight;
import com.kodilla.good.patterns.challenges.flights.repository.Repository;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class FlightsRetriever {

    public static Airport gdansk = new Airport("Gdansk");
    public static Airport warsaw = new Airport("Warsaw");
    public static Airport wroclaw = new Airport("Wroclaw");
    public static Airport krakow = new Airport("Krakow");
    public static Airport berlin = new Airport("Berlin");
    public static Airport paris = new Airport("Paris");

    public Repository retrieve(){

        LocalTime time0 = LocalTime.of(12,0);
        LocalTime time1 = LocalTime.of(13,0);
        LocalTime time2 = LocalTime.of(14,0);
        LocalTime time3 = LocalTime.of(16,0);
        LocalTime time4 = LocalTime.of(19,0);
        LocalTime time5 = LocalTime.of(11,0);
        LocalTime time6 = LocalTime.of(10,0);
        LocalTime time7 = LocalTime.of(20,0);

        Flight flight0 = new Flight(gdansk, warsaw, time0);
        Flight flight1 = new Flight(gdansk, krakow, time2);
        Flight flight2 = new Flight(warsaw, berlin, time4);
        Flight flight3 = new Flight(berlin, paris, time6);
        Flight flight4 = new Flight(paris, wroclaw, time0);
        Flight flight5 = new Flight(wroclaw, gdansk, time1);
        Flight flight6 = new Flight(gdansk, paris, time7);
        Flight flight7 = new Flight(gdansk, berlin, time3);
        Flight flight8 = new Flight(wroclaw, krakow, time5);
        Flight flight9 = new Flight(krakow, gdansk, time6);
        Flight flight10 = new Flight(krakow, paris, time6);

        List<Flight> flightList = new ArrayList<>();

        flightList.add(flight0);
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);

        return new Repository(flightList);
    }


}
