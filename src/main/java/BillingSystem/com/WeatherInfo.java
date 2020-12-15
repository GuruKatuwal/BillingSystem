package BillingSystem.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInfo{

	@JsonProperty("elevation")
	private int elevation;

	@JsonProperty("lng")
	private double lng;

	@JsonProperty("observation")
	private String observation;

	@JsonProperty("ICAO")
	private String iCAO;

	@JsonProperty("clouds")
	private String clouds;

	@JsonProperty("dewPoint")
	private String dewPoint;

	@JsonProperty("datetime")
	private String datetime;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("temperature")
	private String temperature;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("stationName")
	private String stationName;

	@JsonProperty("weatherCondition")
	private String weatherCondition;

	@JsonProperty("windDirection")
	private int windDirection;

	@JsonProperty("windSpeed")
	private String windSpeed;

	@JsonProperty("lat")
	private double lat;

	public int getElevation(){
		return elevation;
	}

	public double getLng(){
		return lng;
	}

	public String getObservation(){
		return observation;
	}

	public String getICAO(){
		return iCAO;
	}

	public String getClouds(){
		return clouds;
	}

	public String getDewPoint(){
		return dewPoint;
	}

	public String getDatetime(){
		return datetime;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public String getTemperature(){
		return temperature;
	}

	public int getHumidity(){
		return humidity;
	}

	public String getStationName(){
		return stationName;
	}

	public String getWeatherCondition(){
		return weatherCondition;
	}

	public int getWindDirection(){
		return windDirection;
	}

	public String getWindSpeed(){
		return windSpeed;
	}

	public double getLat(){
		return lat;
	}
}