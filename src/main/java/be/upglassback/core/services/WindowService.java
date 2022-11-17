package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.*;
import be.upglassback.core.entities.OptionsWindow;
import be.upglassback.core.entities.Window;
import be.upglassback.core.repository.WindowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;



@Service
public class WindowService {
    final Logger logger = LoggerFactory.getLogger(WindowService.class);

    @Autowired
    private WindowRepository windowRepository;


    /**
     *     Get reference list from dao
     */
    public List<WindowDto> findReferenceByPagination() {
        EntityManager em = EMF.getEM();
        List<Window> windows = windowRepository.getlistRefWindoww(em);
        List<WindowDto> windowDtos = new ArrayList<>();

        for (Window w : windows) {

            WindowDto windowDto = new WindowDto();
            windowDto.setIdWindow(w.getIdWindow());
            windowDto.setCode(w.getCode());
            windowDto.setName(w.getName());
            windowDto.setTotalQty(w.getTotalQty());
            windowDto.setUnitSalePrice(w.getUnitSalePrice());

            WindowsTypeDTO typeDTO = new WindowsTypeDTO();
            typeDTO.setIdWindowsType(w.getWindowsType().getIdWindowsType());
            typeDTO.setName(w.getWindowsType().getName());

            ModelDto modelDto = new ModelDto();
            modelDto.setIdModel(w.getModel().getIdModel());
            modelDto.setModelName(w.getModel().getModelName());
            modelDto.setCode(w.getModel().getCode());
            windowDto.setOptionsWindows(new ArrayList<>());
            for (OptionsWindow option : w.getOptionsWindows()) {
                final OptionsWindowDTO optionsWindowDTO = new OptionsWindowDTO();
                optionsWindowDTO.setIdOptionsWindow(option.getIdOptionsWindow());
                optionsWindowDTO.setName(option.getName());
                windowDto.getOptionsWindows().add(optionsWindowDTO);
            }
            windowDto.setWindowsType(typeDTO);
            windowDto.setModel(modelDto);
            windowDtos.add(windowDto);
        }
        return windowDtos;
    }

}
