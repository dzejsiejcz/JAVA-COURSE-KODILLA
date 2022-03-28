package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("A pizza with a tomato sauce and cheese", description);
    }

    @Test
    public void testExtraCheesePizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testExtraCheeseOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("A pizza with a tomato sauce and cheese + an additional cheese", description);
    }

    @Test
    public void testFullPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new TunaDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @Test
    public void testFullOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new TunaDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("A pizza with a tomato sauce and cheese + an additional cheese + salami + tuna", description);
    }
}
