package be.upglassback.core.repository;

import be.upglassback.core.entities.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ModelRepository {

    final Logger logger = LoggerFactory.getLogger(ModelRepository.class);

    /**
     * Constructor
     */
    public ModelRepository() {
    }

    public List getModel(EntityManager em) {
        Query query = em.createNamedQuery("Windows.modelList", Model.class);
        return query.getResultList();
    }

}
