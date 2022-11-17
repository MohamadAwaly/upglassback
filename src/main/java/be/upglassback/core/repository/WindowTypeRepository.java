package be.upglassback.core.repository;

import be.upglassback.core.entities.Brand;
import be.upglassback.core.entities.WindowsType;
import be.upglassback.core.services.WindowsTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class WindowTypeRepository {
    final Logger logger = LoggerFactory.getLogger(WindowTypeRepository.class);

    /**
     * Constructor
     */
    public WindowTypeRepository() {
    }

    /**
     * Get windows type list
     *
     * @param em
     * @return
     */
    public List<WindowsType> getwindowsType(EntityManager em) {
        Query query = em.createNamedQuery("WindowsType.getWindowsTypeList", WindowsType.class);
        return query.getResultList();
    }
}
