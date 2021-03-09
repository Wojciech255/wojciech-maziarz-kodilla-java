package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Gdańsk");
        Flight flight2 = new Flight("Wrocław","Warszawa");
        Flight flight3 = new Flight("Poznań","Lublin");
    }

    public void findFilght(Flight flight) {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("flight1",true);
        flightMap.put("flight2",false);
        flightMap.put("flight3",true);
    }

}
