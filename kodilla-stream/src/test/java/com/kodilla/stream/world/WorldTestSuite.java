package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
            //countries of America
        Country countryInAmerica1 = new Country("USA", new BigDecimal("300000000"));
        Country countryInAmerica2 = new Country("Canada", new BigDecimal("100000000"));
        Country countryInAmerica3 = new Country("Mexico", new BigDecimal("200000000"));
        Country countryInAmerica4 = new Country("Brasilia", new BigDecimal("400000000"));
        List<Country> theListOfCountriesInAmerica = new ArrayList<>();
        theListOfCountriesInAmerica.add(countryInAmerica1);
        theListOfCountriesInAmerica.add(countryInAmerica2);
        theListOfCountriesInAmerica.add(countryInAmerica3);
        theListOfCountriesInAmerica.add(countryInAmerica4);

        //countries of Europe
        Country countryInEurope1 = new Country("Germany", new BigDecimal("80000000"));
        Country countryInEurope2 = new Country("Poland", new BigDecimal("40000000"));
        Country countryInEurope3 = new Country("Italy", new BigDecimal("40000000"));
        Country countryInEurope4 = new Country("Spain", new BigDecimal("30000000"));
        List<Country> theListOfCountriesInEurope = new ArrayList<>();
        theListOfCountriesInEurope.add(countryInEurope1);
        theListOfCountriesInEurope.add(countryInEurope2);
        theListOfCountriesInEurope.add(countryInEurope3);
        theListOfCountriesInEurope.add(countryInEurope4);

            // continents
        Continent america = new Continent("America",theListOfCountriesInAmerica);
        Continent europe = new Continent("Europe", theListOfCountriesInEurope);
        List<Continent> theListOfContinents = new ArrayList<>();
        theListOfContinents.add(america);
        theListOfContinents.add(europe);
            //world
        World world = new World(theListOfContinents);

        //When
        BigDecimal peopleInWorld =  world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("1190000000");
        assertEquals(expected, peopleInWorld);
    }
}
