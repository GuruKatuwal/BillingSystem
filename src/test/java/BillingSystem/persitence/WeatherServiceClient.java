package BillingSystem.persitence;

import BillingSystem.com.WeatherInfo;
import BillingSystem.com.weather.WeatherObservation;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=43.03207&lng=-89.499324&maxrows=10&username=gkatuwal&style=full");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();

        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        WeatherInfo weather = mapper.readValue(response, WeatherInfo.class);
        String stationName = "MIDDLETON";
        assertEquals(null,weather.getICAO());
    }
}