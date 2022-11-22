package be.upglassback.core.services;


import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.BodyShellTypeDTO;
import be.upglassback.core.dto.BrandDTO;
import be.upglassback.core.entities.BodyShellType;
import be.upglassback.core.entities.Brand;
import be.upglassback.core.repository.BodyShellTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class BodyShellTypeService {

    final Logger logger = LoggerFactory.getLogger(BodyShellTypeService.class);

    @Autowired
    BodyShellTypeRepository bodyShellTypeRepository;

    public List<BodyShellTypeDTO> getBodyShellType() {
        EntityManager em = EMF.getEM();
        List<BodyShellType> bodyShellTypes = bodyShellTypeRepository.getBodyShellType(em);
        List<BodyShellTypeDTO> bodyShellTypeDTOS = new ArrayList<>();

        for (BodyShellType bst : bodyShellTypes) {
            BodyShellTypeDTO bstDTO = new BodyShellTypeDTO();
            bstDTO.setIdbodyShelTypes(bst.getIdbodyShelTypes());
            bstDTO.setName(bst.getName());
            bodyShellTypeDTOS.add(bstDTO);
        }
        return bodyShellTypeDTOS;
    }

}
