package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(2, 4);
        //Then
        assertEquals(6, result);
    }
    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(2, 4);
        //Then
        assertEquals(-2, result);
    }
    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(2, 4);
        //Then
        assertEquals(8, result);
    }
    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(2, 4);
        //Then
        assertEquals(0.5, result);
    }

    @Test
    void testDivByZero() {
        //Given
        //When
        double result = calculator.div(2, 0);
        //Then
        assertEquals(0, result);
    }

}
