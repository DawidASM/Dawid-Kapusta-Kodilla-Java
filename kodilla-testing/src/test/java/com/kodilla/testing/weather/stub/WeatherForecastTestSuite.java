package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void calculateWeatherForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calcualteForecast().size();

        //Taken
        Assert.assertEquals(5,quantityOfSensors);
    }
}
