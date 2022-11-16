package be.upglassback.core.repository;


import be.upglassback.core.entities.Window;
import be.upglassback.core.services.WindowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class WindowRepository {
    final Logger logger = LoggerFactory.getLogger(WindowRepository.class);

    /**
     * Constructor
     */
    public WindowRepository() {
    }

    /**
     * Get list of reference windows
     * @param em
     * @return
     */
    public List getlistRefWindoww(EntityManager em) {
        Query query = em.createNamedQuery("window.getList", Window.class);
        return query.getResultList();
    }
}
