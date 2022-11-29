package be.upglassback.core.services;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.dto.OptionsWindowDTO;
import be.upglassback.core.entities.OptionsWindow;
import be.upglassback.core.repository.OptionsWindowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class OptionsWindowService {


    final Logger logger = LoggerFactory.getLogger(OptionsWindowService.class);

    @Autowired
    OptionsWindowRepository optionsWindowRepository;

    public List<OptionsWindowDTO> getOptionWindow() {
        EntityManager em = EMF.getEM();
        List<OptionsWindow> optionsWindows = optionsWindowRepository.getOptions(em);
        List<OptionsWindowDTO> optionsWindowDTOS = new ArrayList<>();
        for (OptionsWindow op : optionsWindows) {
            OptionsWindowDTO optionsWindowDTO = new OptionsWindowDTO();
            optionsWindowDTO.setIdOptionsWindow(op.getIdOptionsWindow());
            optionsWindowDTO.setName(op.getName());
            optionsWindowDTOS.add(optionsWindowDTO);
        }
        return optionsWindowDTOS;
    }
}
