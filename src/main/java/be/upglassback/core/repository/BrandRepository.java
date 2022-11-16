package be.upglassback.core.repository;

import be.upglassback.core.entities.Brand;
import be.upglassback.core.entities.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BrandRepository {

    final Logger logger = LoggerFactory.getLogger(BrandRepository.class);

    /**
     * Constructor
     */
    public BrandRepository() {
    }

    /**
     * Get brand list
     * @param em
     * @return
     */
    public List getBrands (EntityManager em) {
        Query query= em.createNamedQuery("Windows.brands", Brand.class);
        return query.getResultList();
    }
}
