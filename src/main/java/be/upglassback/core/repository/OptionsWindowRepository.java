package be.upglassback.core.repository;

import be.upglassback.core.entities.OptionsWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OptionsWindowRepository {

    final Logger logger = LoggerFactory.getLogger(OptionsWindowRepository.class);

    /**
     * Constructor
     */
    public OptionsWindowRepository() {
    }

    public List<OptionsWindow> getOptions (EntityManager em) {
        Query query = em.createNamedQuery("Option.getOptionsList", OptionsWindow.class);
        return query.getResultList();
    }
}
