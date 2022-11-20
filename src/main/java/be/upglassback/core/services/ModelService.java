package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.BodyShellTypeDTO;
import be.upglassback.core.dto.BrandDTO;
import be.upglassback.core.dto.ModelDto;
import be.upglassback.core.entities.Model;
import be.upglassback.core.repository.ModelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModelService {

    final Logger logger = LoggerFactory.getLogger(ModelService.class);

    @Autowired
    ModelRepository modelRepository;

    public List<ModelDto> listModel(int id) {
        EntityManager em = EMF.getEM();
        logger.info("dans liste model :: " + id);
        List<Model> models = modelRepository.getModel(em, id);
        List<ModelDto> modelDtos = new ArrayList<>();

        for (Model model : models) {
            ModelDto modelDto = new ModelDto();
            modelDto.setIdModel(model.getIdModel());
            modelDto.setCode(model.getCode());
            modelDto.setModelName(model.getModelName());

            BodyShellTypeDTO bodyShellTypeDTO = new BodyShellTypeDTO();
            bodyShellTypeDTO.setIdbodyShelTypes(model.getBodyShellType().getIdbodyShelTypes());
            bodyShellTypeDTO.setName(model.getBodyShellType().getName());
            modelDto.setBodyShellType(bodyShellTypeDTO);

            BrandDTO brandDTO = new BrandDTO();
            brandDTO.setIdBrand(model.getBrand().getIdBrand());
            brandDTO.setBrandName(model.getBrand().getBrandName());
            modelDto.setBrand(brandDTO);

            modelDtos.add(modelDto);
        }
        return modelDtos;

    }

}
