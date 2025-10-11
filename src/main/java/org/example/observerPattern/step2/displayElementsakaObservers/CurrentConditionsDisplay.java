package org.example.observerPattern.step2.displayElementsakaObservers;

import org.example.observerPattern.step2.Interfaces.DisplayElement;
import org.example.observerPattern.step2.Interfaces.Observer;
import org.example.observerPattern.step2.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp; //or use weatherData.getTemperature
        this.humidity = humidity; // or use weatherData.getHumidity
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
