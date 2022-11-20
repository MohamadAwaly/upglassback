package be.upglassback.core.repository;

import be.upglassback.core.entities.BodyShellType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BodyShellTypeRepository {
    final Logger logger = LoggerFactory.getLogger(BodyShellTypeRepository.class);

    /**
     * Constructor
     */
    public BodyShellTypeRepository() {

    }

    /**
     * Get body shell type liste
     *
     * @param em
     * @return
     */
    public List getBodyShellType(EntityManager em) {
        Query query = em.createNamedQuery("BodyShelType.getList", BodyShellType.class);
        return query.getResultList();
    }


}
