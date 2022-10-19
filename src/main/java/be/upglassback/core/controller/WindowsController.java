package be.upglassback.core.controller;

import be.upglassback.core.entities.Window;
import be.upglassback.core.services.WindowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/window")
public class WindowsController {

    WindowService windowService = new WindowService();

    @GetMapping("/display")
    public @ResponseBody List<Window> displayWindow() {
        System.out.println("Method displayWindow");
        return windowService.findAll();

    }
}
