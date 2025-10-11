package org.example.observerPattern.step2;

import org.example.observerPattern.step2.displayElementsakaObservers.CurrentConditionsDisplay;
import org.example.observerPattern.step2.displayElementsakaObservers.ForecastDisplay;
import org.example.observerPattern.step2.displayElementsakaObservers.StatisticsDisplay;

public class Test_WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
