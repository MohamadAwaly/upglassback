package be.upglassback.core.controller;

import be.upglassback.core.dto.BodyShellTypeDTO;
import be.upglassback.core.services.BodyShellTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/bodyShellType")
public class BodyShellTypeController {

    @Autowired
    BodyShellTypeService bodyShellTypeService;

        @GetMapping("/bodysShellType")
    public List<BodyShellTypeDTO> displayWindow() {
        return bodyShellTypeService.getBodyShellType();
    }
}
