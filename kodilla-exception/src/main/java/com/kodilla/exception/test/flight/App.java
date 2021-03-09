package com.kodilla.exception.test.flight;

public class App {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa", "Gdańsk");
        Flight flight2 = new Flight("Wrocław", "Warszawa");
        Flight flight3 = new Flight("Poznań", "Lublin");
        FlightFinder flightFinder = new FlightFinder();
        try {
            System.out.println(flightFinder.findFlight(flight2));
            System.out.println(flightFinder.findFlight(flight3));
            System.out.println(flightFinder.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not supported");
        }
    }
}
