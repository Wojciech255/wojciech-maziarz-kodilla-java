package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;


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

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // given
        List<Integer> emptyList = new ArrayList<>();
        // When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);
        // Then
        Assertions.assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));

        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);
        //Then
        Assertions.assertEquals(oddList, listNumbers);
    }
}



