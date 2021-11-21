package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
            //countries of America
        Country countryInAmerica1 = new Country("USA", new BigDecimal("300000000"));
        Country countryInAmerica2 = new Country("Canada", new BigDecimal("100000000"));
        Country countryInAmerica3 = new Country("Mexico", new BigDecimal("200000000"));
        Country countryInAmerica4 = new Country("Brasilia", new BigDecimal("400000000"));

        Continent america = new Continent("America");
        america.addCountry(countryInAmerica1);
        america.addCountry(countryInAmerica2);
        america.addCountry(countryInAmerica3);
        america.addCountry(countryInAmerica4);

            //countries of Europe
        Country countryInEurope1 = new Country("Germany", new BigDecimal("80000000"));
        Country countryInEurope2 = new Country("Poland", new BigDecimal("40000000"));
        Country countryInEurope3 = new Country("Italy", new BigDecimal("40000000"));
        Country countryInEurope4 = new Country("Spain", new BigDecimal("30000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(countryInEurope1);
        europe.addCountry(countryInEurope2);
        europe.addCountry(countryInEurope3);
        europe.addCountry(countryInEurope4);

            //world
        World world = new World();
        world.addContinents(america);
        world.addContinents(europe);

        //When
        BigDecimal peopleInWorld =  world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("1190000000");
        assertEquals(expected, peopleInWorld);
    }
}
