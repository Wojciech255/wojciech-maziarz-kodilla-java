package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    double sum = 0;
    int licznik = 0 ;


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
    public double calculateAverage() {


        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum = sum + temperature.getValue();
            licznik++;
        }
       return  sum / licznik;
    }

    public double mediana () {

        ArrayList<Double> list = new ArrayList<Double>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue());
        }
        Collections.sort(list);
        double median = 0;
        if (list.size() % 2 == 0)
            median = list.size();
        return list.size();
    }
}
