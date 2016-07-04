package main.java;

import observer.weatherobservable.CurrentConditionsDisplay;
import observer.weatherobservable.ForecastDisplay;
import observer.weatherobservable.StatisticsDisplay;
import observer.weatherobservable.WeatherData;

public class application {

	public static void main(String[] args) {
		/*
		* Observer
		* The observable (weatherData) maintains a list of observers,
		* and notifies them of any changes via its update method.
		*
		* Observers (currentConditions) are instantiated with the observable,
		* and register themselves with it.  All observers are notified of changes from the
		* observers update method.
		*
		* Behavioral */
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
