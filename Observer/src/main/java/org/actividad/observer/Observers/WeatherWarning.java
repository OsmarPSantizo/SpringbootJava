package org.actividad.observer.Observers;

import org.actividad.observer.Interfaces.Observer;
import org.springframework.stereotype.Component;

@Component
public class WeatherWarning implements Observer {
    private Integer threshold;

    @Override
    public void update(int temperature) {
        if (temperature > threshold) {
            System.out.println("Temperature alert! Temperature has exceeded the threshold of " + threshold + " degrees.");
        }
    }
}
