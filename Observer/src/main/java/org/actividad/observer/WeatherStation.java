package org.actividad.observer;

import org.actividad.observer.Interfaces.Observer;
import org.actividad.observer.Interfaces.Subject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
        notifyObservers();
    }
}
