package be.upglassback.core.controller;

import be.upglassback.core.dto.ModelDto;
import be.upglassback.core.dto.WindowDto;
import be.upglassback.core.services.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/model")
public class ModelController {
    final Logger logger = LoggerFactory.getLogger(ModelController.class);

    @Autowired
    ModelService modelService;

    @GetMapping("/{id}")
    public List<ModelDto> displayWindow(@PathVariable("id") int id) {
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        logger.info("id:: " + id);
        return modelService.listModel(id);
    }
}
