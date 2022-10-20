package be.upglassback.core.services;

import be.upglassback.core.repository.WindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class WindowService {

    @Autowired
    private WindowRepository windowRepository;

    public List findAll() {
        return windowRepository.findAll();
    }

    public List<Integer> windowsIds( EntityManager em ) {
        Query queryIds = em.createNamedQuery( "Windows.ids" );
        return queryIds.getResultList();
    }
}
