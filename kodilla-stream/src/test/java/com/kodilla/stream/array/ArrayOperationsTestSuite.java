package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        //When
        double average = ArrayOperations.getAverage(numbers);
        double expected = 9.5;

        //Then
        Assertions.assertEquals(average, expected);
    }
}
