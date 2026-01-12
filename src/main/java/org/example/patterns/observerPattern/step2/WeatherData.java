package org.example.patterns.observerPattern.step2;

import org.example.patterns.observerPattern.step2.Interfaces.Observer;
import org.example.patterns.observerPattern.step2.Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    public void measurementsChanged(){
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) { observerList.add(o); }

    @Override
    public void removeObserver(Observer o) {observerList.remove(o); }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(temperature, humidity, pressure); //can be made parameter less
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
