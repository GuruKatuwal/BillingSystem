package BillingSystem.util;

import BillingSystem.persistence.GenericDao;

/**
 * The type Dao factory.
 */
public class DaoFactory {
    /**
     * Instantiates a new Dao factory.
     */
    public DaoFactory() {
    }

    /**
     * Create dao generic dao.
     *
     * @param type the type
     * @return the generic dao
     */
    public static GenericDao createDao(Class type){
        return new GenericDao(type);
    }
}
