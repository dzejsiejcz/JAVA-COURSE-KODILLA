package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When input some empty list, then exterminate will return empty List"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<>();
        //When
        OddNumbersExterminator result = new OddNumbersExterminator();
        List<Integer> output = result.exterminate(numbers);
        System.out.println("Testing " + numbers);
        List<Integer> expected = new ArrayList<>();
        //Then
        Assertions.assertEquals(output, expected);
    }

    @DisplayName(
            "When input some list of numbers, then exterminate will return List with odd only numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,45,6,7));
        //When
        OddNumbersExterminator result = new OddNumbersExterminator();

        System.out.println("Testing " + numbers);
        List<Integer> expected = new ArrayList<>(List.of(2, 6));
        //Then
        Assertions.assertEquals(((OddNumbersExterminator) result).exterminate(numbers), expected);
    }


}
