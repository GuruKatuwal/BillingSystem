package BillingSystem.persistence;


import BillingSystem.com.country.Zippo;
import BillingSystem.com.weather.WeatherObservation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

/**
 * The type Swapi dao.
 */
public class WeatherDao {
    /**
     * The Logger.
     */
    Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;


     WeatherObservation getWeather(){
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=43.03207&lng=-89.499324&maxrows=10&username=gkatuwal&style=full");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        WeatherObservation weather = null;
        try {

            weather = mapper.readValue(response, WeatherObservation.class);

        } catch (JsonProcessingException e) {
            logger.error("Json not found");
        }
        return weather;
    }

}
