package com.kodilla.testing.weather.stub;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class WeatherForecast {
    private  Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage () {
        double counter = 0.0;
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            counter++;
        }
        return sum/counter;
    }

    public double calculateMedian () {
        Collection<Double> values = temperatures.getTemperatures().values();
        Double[] numArray = values.toArray(new Double[0]);
        Arrays.sort(numArray);
        return numArray[numArray.length/2];
    }

}
