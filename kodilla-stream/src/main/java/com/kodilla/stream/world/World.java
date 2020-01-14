package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfCountriesOnWorld = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfCountriesOnWorld.add(continent);

    }

    public BigDecimal getPeopleQuantity(){
        return listOfCountriesOnWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum,country) -> sum = sum.add(country));


    }
}
