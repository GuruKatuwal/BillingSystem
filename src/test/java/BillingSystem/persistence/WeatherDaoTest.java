package BillingSystem.persistence;

import BillingSystem.com.weather.WeatherObservation;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDaoTest {

    @Test
    void getWeatherSuccess() {
        WeatherDao dao = new WeatherDao();
        assertEquals(null, dao.getWeather());


    }
}