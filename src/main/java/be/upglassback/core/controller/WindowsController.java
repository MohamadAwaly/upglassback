package be.upglassback.core.controller;

import be.upglassback.core.dto.WindowDto;
import be.upglassback.core.dto.WindowsTypeDTO;
import be.upglassback.core.entities.OptionsWindow;
import be.upglassback.core.entities.Window;
import be.upglassback.core.entities.WindowsType;
import be.upglassback.core.repository.WindowRepository;
import be.upglassback.core.services.WindowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/window")
public class WindowsController {
    final Logger logger = LoggerFactory.getLogger(WindowsController.class);

    @Autowired
    WindowService windowService;

    @GetMapping("/display")
    public List<WindowDto> displayWindow() {
        return windowService.findReferenceByPagination();
    }

    @PostMapping("/add")
    public void addReference(@RequestBody Window window) {
        windowService.addReferences(window);
    }
}
