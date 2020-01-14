package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        listOfCountriesOnContinent.add(country);
    }

    public boolean removeCountry(Country country){
        return listOfCountriesOnContinent.remove(country);
    }

    public List<Country> getListOfCountriesOnContinent(){
        return new ArrayList<>(listOfCountriesOnContinent);
    }

}
