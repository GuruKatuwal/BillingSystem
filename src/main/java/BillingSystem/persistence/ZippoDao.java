package BillingSystem.persistence;


import BillingSystem.com.country.Zippo;
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
public class ZippoDao {
    /**
     * The Logger.
     */
    Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;

    /**
     * Get planet planet.
     *
     * @return the planet
     */
    public Zippo getCoutry(){
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.zippopotam.us/us/53713");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Zippo zippo = null;
        try {

            zippo = mapper.readValue(response, Zippo.class);
        } catch (JsonProcessingException e) {
            logger.error("Json not found");
        }
        return zippo;
    }

}
