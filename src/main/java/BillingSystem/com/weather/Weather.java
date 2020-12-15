package BillingSystem.com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather{

	@JsonProperty("weatherObservation")
	private WeatherObservation weatherObservation;

	public WeatherObservation getWeatherObservation(){
		return weatherObservation;
	}
}