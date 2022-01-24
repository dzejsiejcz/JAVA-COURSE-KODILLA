package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given & When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bunWithSesame(true)
                .sauce("barbecue")
                .burgers(2)
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);

        int quantOfIngredients = bigmac.getIngredients().size();
        List<String> ingredients = bigmac.getIngredients();

        //Then
        assertEquals(3, quantOfIngredients);
        assertEquals(2, bigmac.getBurgers());
        assertEquals("onion", ingredients.get(0));
        assertEquals("cheese", ingredients.get(1));
        assertEquals("cucumber", ingredients.get(2));
        assertTrue(bigmac.isBunWithSesame());



    }
}
