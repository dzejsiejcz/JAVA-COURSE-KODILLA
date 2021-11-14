package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
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
        OddNumbersExterminator theList = new OddNumbersExterminator();
        List<Integer> result = theList.exterminate(numbers);
        System.out.println("Testing " + numbers);
        List<Integer> expected = new ArrayList<>();
        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName(
            "When input some list of numbers, then exterminate will return List with odd only numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer[] set = new Integer[]{1,2,3,4,5,6,7};
        List<Integer> numbers = Arrays.asList(set);
        //When
        OddNumbersExterminator theList = new OddNumbersExterminator();
        List<Integer> result = theList.exterminate(numbers);
        System.out.println("Testing " + numbers);
        List<Integer> expected = new ArrayList<>(List.of(2, 4, 6));
        //Then
        Assertions.assertEquals(expected, result);
    }

}
