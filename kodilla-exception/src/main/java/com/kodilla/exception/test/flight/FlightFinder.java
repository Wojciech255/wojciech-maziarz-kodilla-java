package com.kodilla.exception.test.flight;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> getFilghts() {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa", true);
        flightMap.put("Lublin", false);
        flightMap.put("Katowice", true);
        return flightMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (getFilghts().containsKey(flight.getArrivalAirport())) {
            return getFilghts().get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
