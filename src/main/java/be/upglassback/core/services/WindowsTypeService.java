package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.WindowsTypeDTO;
import be.upglassback.core.entities.WindowsType;
import be.upglassback.core.repository.WindowTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class WindowsTypeService {

    @Autowired
    private WindowTypeRepository windowTypeRepository;

    public List<WindowsTypeDTO> getWindowsType() {
        EntityManager em = EMF.getEM();
        List<WindowsType> windowsTypes = windowTypeRepository.getwindowsType(em);
        List<WindowsTypeDTO> windowTypeDTOS = new ArrayList<>();

        for (WindowsType wt : windowsTypes) {
            WindowsTypeDTO windowTypeDTO = new WindowsTypeDTO();
            windowTypeDTO.setIdWindowsType(wt.getIdWindowsType());
            windowTypeDTO.setName(wt.getName());
            windowTypeDTOS.add(windowTypeDTO);
        }
        return windowTypeDTOS;
    }
}
