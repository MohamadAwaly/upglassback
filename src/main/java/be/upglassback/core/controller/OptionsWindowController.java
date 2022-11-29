package be.upglassback.core.controller;

import be.upglassback.core.dto.OptionsWindowDTO;
import be.upglassback.core.services.OptionsWindowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/option")
public class OptionsWindowController {

    final Logger logger = LoggerFactory.getLogger(OptionsWindowController.class);

    @Autowired
    OptionsWindowService optionsWindowService;

    @GetMapping("options")
    public List<OptionsWindowDTO> displayWindow() {
        return optionsWindowService.getOptionWindow();
    }
}
