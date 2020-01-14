package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){

        //Europe's countries
        Country germany = new Country("Germany", BigDecimal.valueOf(235799753));
        Country france = new Country("France", BigDecimal.valueOf(535353453));
        Country poland = new Country("Poland", BigDecimal.valueOf(369764322));
        Country lithuania = new Country("Lithuania", BigDecimal.valueOf(147087543));

        //Asia's countries
        Country japan = new Country("Japan", BigDecimal.valueOf(534647486));
        Country china = new Country("China", BigDecimal.valueOf(987977899));
        Country southKorea = new Country("South Korea", BigDecimal.valueOf(464644246));
        Country india = new Country("India", BigDecimal.valueOf(646335353));

        //South American countries
        Country brazil = new Country("Brazil", BigDecimal.valueOf(456456424));
        Country uruguay = new Country("Uruguay", BigDecimal.valueOf(535353465));
        Country argentina = new Country("Argentina", BigDecimal.valueOf(526456457));
        Country chile = new Country("Chile", BigDecimal.valueOf(525343535));

        //Continents
        Continent europe =new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent southamerica = new Continent("South America");

        //World
        World world = new World();

        europe.addCountry(germany);
        europe.addCountry(poland);
        europe.addCountry(lithuania);
        europe.addCountry(france);

        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(southKorea);

        southamerica.addCountry(chile);
        southamerica.addCountry(argentina);
        southamerica.addCountry(brazil);
        southamerica.addCountry(uruguay);

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(southamerica);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("5965219936");
        Assert.assertEquals(expectedQuantity,allPeople);


    }
}
