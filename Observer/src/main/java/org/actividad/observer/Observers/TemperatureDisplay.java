package org.actividad.observer.Observers;

import org.actividad.observer.Interfaces.Observer;
import org.springframework.stereotype.Component;

@Component
public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature){
        System.out.println("Temperatura Actual: " + temperature);
    }
}
