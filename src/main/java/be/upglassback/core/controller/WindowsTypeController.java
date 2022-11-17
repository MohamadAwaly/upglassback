package be.upglassback.core.controller;

import be.upglassback.core.dto.WindowsTypeDTO;
import be.upglassback.core.services.WindowsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/windowType")
public class WindowsTypeController {

    @Autowired
    WindowsTypeService windowsTypeService;

    @GetMapping("/windowstype")
    public List<WindowsTypeDTO> displayWindow() {
        return windowsTypeService.getWindowsType();
    }

}
