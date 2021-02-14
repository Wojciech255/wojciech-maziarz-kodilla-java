package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europa = new Continent("Europa");
        world.addContinent(europa);
        Continent azja = new Continent("Azja");
        world.addContinent(azja);
        Continent afryka = new Continent("Afryka");
        world.addContinent(afryka);

        europa.addCountry(new Country("Polska", new BigDecimal("9999")));
        europa.addCountry(new Country("Hiszpania", new BigDecimal("8888")));
        europa.addCountry(new Country("Niemcy", new BigDecimal("9999")));
        europa.addCountry(new Country("Grecja", new BigDecimal("6666")));

        azja.addCountry(new Country("Filipiny", new BigDecimal("8888")));
        azja.addCountry(new Country("Chiny", new BigDecimal("7777")));
        azja.addCountry(new Country("Japonia", new BigDecimal("5555")));
        azja.addCountry(new Country("Tajlandia", new BigDecimal("4444")));

        afryka.addCountry(new Country("Kenia", new BigDecimal("3333")));
        afryka.addCountry(new Country("Maroko", new BigDecimal("2222")));
        afryka.addCountry(new Country("Nigeria", new BigDecimal("1111")));
        afryka.addCountry(new Country("Tanzania", new BigDecimal("4444")));

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedTotalPeopleQuantity = new BigDecimal("73326");

        //Then
        assertEquals(expectedTotalPeopleQuantity, totalPeopleQuantity);
    }
}
