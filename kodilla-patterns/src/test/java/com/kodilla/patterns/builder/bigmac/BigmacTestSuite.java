package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bunWithSesame(true)
                .sauce("barbecue")
                .burgers(2)
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);
        //When
        int quantOfIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, quantOfIngredients);
        assertTrue(bigmac.isBunWithSesame());



    }
}
