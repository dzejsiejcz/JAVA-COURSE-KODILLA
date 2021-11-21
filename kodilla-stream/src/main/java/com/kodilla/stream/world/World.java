package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> theListOfContinents = new ArrayList<>();

    public World(){}

    public void addContinents(Continent continent) {
        theListOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal output = theListOfContinents.stream()
                .flatMap(continent -> continent.getTheListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return output;
    }
}
