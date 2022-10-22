package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.entities.Window;
import be.upglassback.core.repository.WindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class WindowService {
    final Logger logger = LoggerFactory.getLogger(WindowService.class);

    @Autowired
    private WindowRepository windowRepository;

    //Get reference list from dao
    public List<Window> findReferenceByPagination() {
        EntityManager em = EMF.getEM();
//        EntityTransaction trans = em.getTransaction();
        try {
//             trans.begin();
            return windowRepository.findReferenceByPagination(em);
//            trans.commit();
        } catch (Exception e) {
            logger.info("Error get windows reference");
            return null;
        }
    }

    public List findAll() {
        return windowRepository.findAll();
    }

    public List<Integer> windowsIds() {
        EntityManager em = EMF.getEM();
        Query queryIds = em.createNamedQuery("Windows.ids");
        return queryIds.getResultList();
    }
}
