package BillingSystem.persitence;

import BillingSystem.entity.com.country.Zippo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.zippopotam.us/us/53713");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Zippo zippo = mapper.readValue(response, Zippo.class);
        String expectedCountry = "United States";
        assertEquals(expectedCountry,zippo.getCountry());
    }
}