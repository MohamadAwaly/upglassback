package be.upglassback.core.repository;


import be.upglassback.core.entities.Window;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WindowRepository {

    //windows List
    public static List<Window> windows;

    //Get all window reference list
    public List findReferenceByPagination(EntityManager em) {
        Query query = em.createNamedQuery("Window.list", Window.class);
//        Window window = em.find(Window.class, 1);
        return query.getResultList();
    }

    //Constructor
    public WindowRepository() {
        windows = new ArrayList<>();
    }

//    public List findAll() {
//        try {
//            System.out.printf("methode findall");
//            EntityManager em = EMF.getEM();
//            Query query = em.createNamedQuery("Windows.ReferencesList");
//            return query.getResultList();
//        } catch (Exception e) {
//            System.out.println("Erreur ");
//            return null;
//        }
//
//    }
//
//    public List<Integer> windowsIds(EntityManager em) {
//        Query queryIds = em.createNamedQuery("Windows.ids");
//        return queryIds.getResultList();
//    }


}
