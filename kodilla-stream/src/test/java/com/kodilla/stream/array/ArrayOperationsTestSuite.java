package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] input = {1, 3, 5, 10, 11, 12, 15};
        //When
        double result = ArrayOperations.getAverage(input);
        //Then
        double expected = 8.142857143;
        assertEquals(expected, result, 0.0001);
    }
}
