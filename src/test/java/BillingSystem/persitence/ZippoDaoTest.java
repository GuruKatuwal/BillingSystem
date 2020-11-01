package BillingSystem.persitence;

import BillingSystem.persistence.ZippoDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZippoDaoTest {

    @Test
    void getPlanetSuccess() {
        ZippoDao dao = new ZippoDao();
        assertEquals("United States", dao.getCoutry().getCountry());
        assertEquals("53713", dao.getCoutry().getPostCode());
        assertEquals("US", dao.getCoutry().getCountryAbbreviation());
    }
}
