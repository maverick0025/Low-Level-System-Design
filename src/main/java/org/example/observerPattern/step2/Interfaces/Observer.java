package org.example.observerPattern.step2.Interfaces;

public interface Observer {
    //the update method can be made parameter less and when the observers are notified, using this update method, we can fetch the temperature, pressure, humidity using the getter methods that's been set in WeatherData class. This will reduce alot of clutter.
    public void update(float temp, float humidity, float pressure);
}