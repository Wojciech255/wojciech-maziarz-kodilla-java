package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i]) // i po wstawieniu np 0 wyswietla zerowy element tablicy
                .forEach(System.out::println); // wypisywanie elementow tablicy

        OptionalDouble average = IntStream.range(0, numbers.length) // poczytac o typie Optional double
                .map(i -> numbers[i])
                .average();
        return average.getAsDouble();
    }
}