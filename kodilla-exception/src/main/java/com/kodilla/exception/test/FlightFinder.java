package com.kodilla.exception.test;

import jdk.nashorn.internal.runtime.FindProperty;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public  void findFlight (Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> listOfAirport  = new HashMap<>();
        listOfAirport.put("Warsaw", true);
        listOfAirport.put("Moscow", true);
        listOfAirport.put("Tokyo", false);
        listOfAirport.put("Beijing", false);
        listOfAirport.put("Paris",true);


        Boolean getDeparture = (Boolean)listOfAirport.get(flight.getDepartureAirport());
        Boolean getArrival = (Boolean)listOfAirport.get(flight.getArrivalAirport());

        if( getArrival && getDeparture){
            System.out.println("The connection is available.");

        } else {
            throw new RouteNotFoundException("Exception detected.");
        }
    }
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        Flight testFlight1 = new Flight("Warsaw","Moscow");
        Flight testFlight2 = new Flight("Moscow", "Tokyo");
        Flight testFlight3 = new Flight("Beijing", "Paris");
        Flight testFlight4 = new Flight("Warsaw", "Paris");


        try {
            flightFinder.findFlight(testFlight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Please choose other airports!");

        } finally {
            System.out.println("Thanks for using our search engine. :)\n");
        }

        try {
            flightFinder.findFlight(testFlight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Please choose other airports!");

        } finally {
            System.out.println("Thanks for using our search engine. :)\n");
        }


        try {
            flightFinder.findFlight(testFlight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Please choose other airports!");

        } finally {
            System.out.println("Thanks for using our search engine. :)\n");
        }

        try {
            flightFinder.findFlight(testFlight4);
        } catch (RouteNotFoundException e) {
            System.out.println("Please choose other airports!");

        } finally {
            System.out.println("Thanks for using our search engine. :)\n");
        }


    }
}
