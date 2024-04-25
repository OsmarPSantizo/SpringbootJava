package org.actividad.observer;

import org.actividad.observer.Observers.TemperatureDisplay;
import org.actividad.observer.Observers.WeatherWarning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
	}
	WeatherStation weatherStation = new WeatherStation();

	TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
	WeatherWarning weatherWarning = new WeatherWarning(30);


        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

		weatherStation.setTemperature(25);
        weatherStation.setTemperature(32);

}
