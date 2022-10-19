package be.upglassback.core.repository;


import be.upglassback.core.connection.EMF;
import be.upglassback.core.entities.Window;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WindowRepository  {

    //windows List
    public static List<Window> windows;

    //Constructor
    public WindowRepository() {
        windows = new ArrayList<>();
    }

    public List<Window> findAll() {
        System.out.printf("methode findall");
        EntityManager em = EMF.getEM();
        TypedQuery<Window> query = em.createNamedQuery("Windows.ReferencesList", Window.class);
        return query.getResultList();
    }


}
