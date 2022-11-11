package be.upglassback.core.repository;


import be.upglassback.core.entities.Window;
import be.upglassback.core.entities.WindowOptionWindow;
import be.upglassback.core.services.WindowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class WindowRepository {
    final Logger logger = LoggerFactory.getLogger(WindowService.class);

    //windows List
    public static List<Window> windows;

    //Get all window reference list
    public List findReferenceByPagination(EntityManager em) {
        //Query queryi = em.createNamedQuery("Window.list", Window.class);
        Query query = em.createNamedQuery("test", Window.class);
        List<Object> testList  = new ArrayList<>();
        testList.add(query.getResultList());
        for (Object obj: testList) {
            logger.info("query :: " + obj);
        }

        return query.getResultList();
    }


    //Constructor
    public WindowRepository() {
        windows = new ArrayList<>();
    }


}
