package com.kodilla.testing.weather.mock;                                        // [1]

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

 @ExtendWith(MockitoExtension.class)
 class WeatherForecastTestSuite {                                                 // [10]
     @Mock
     private Temperatures temperaturesMock;
     private HashMap<String,Double> prepareTestData() {
         HashMap<String,Double> temperaturesMap = new HashMap<String,Double>();
         temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
         temperaturesMap.put("Krakow", 26.2);                                       // [16]
         temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
         temperaturesMap.put("Warszawa", 25.2);                                     // [18]
         temperaturesMap.put("Gdansk", 26.1);
         return temperaturesMap;
     }

     @Test                                                                  // [11]
    void testCalculateForecastWithMock() {                                        // [12]
        //Given
        //Temperatures temperaturesMock = mock(Temperatures.class);//zastapienie @Mock                  // [13]
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);   // [21]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();        // [22]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                             // [23]

    }
    @Test
            void testCalculateAverage(){
        //Given
        HashMap<String,Double> temperaturesMap = prepareTestData();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double srednia = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.56,srednia);
    }
     @Test
     void testMediana(){
         //Given
         HashMap<String,Double> temperaturesMap = prepareTestData();
         when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
         WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

         //When
         double mediana = weatherForecast.mediana();

         //Then
         Assertions.assertEquals(25.5,mediana);
     }

}
