package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.BrandDTO;
import be.upglassback.core.entities.Brand;
import be.upglassback.core.repository.BrandRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {
    final Logger logger = LoggerFactory.getLogger(BrandService.class);

    @Autowired
    private BrandRepository brandRepository;

    public List<BrandDTO> getBrands() {
        EntityManager em = EMF.getEM();
        List<Brand> brands = brandRepository.getBrands(em);
        List<BrandDTO> brandsDTOS = new ArrayList<>();

        for (Brand b : brands) {
            BrandDTO brand = new BrandDTO();
            brand.setIdBrand(b.getIdBrand());
            brand.setBrandName(b.getBrandName());
            brandsDTOS.add(brand);
        }

        return brandsDTOS;
    }
}
