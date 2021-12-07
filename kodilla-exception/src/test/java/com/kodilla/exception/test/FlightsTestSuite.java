package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightsTestSuite {

    @Test
    void SearchFlightsTest() throws RouteNotFoundException {

        //given
        SearchFlight searchFlight = new SearchFlight();
        Flight flight1 = new Flight("Warsaw", "Gdansk");
        Flight flight2 = new Flight("Warsaw", "Radom");
        Flight flight3 = new Flight("Gdansk", "Warsaw");

        //when & then
        assertThrows(RouteNotFoundException.class, () -> searchFlight.isOpen(flight2));
        assertTrue(searchFlight.isOpen(flight3));
        assertFalse(searchFlight.isOpen(flight1));
    }
}
