package be.upglassback.core.controller;

import be.upglassback.core.dto.WindowDto;
import be.upglassback.core.entities.Window;
import be.upglassback.core.services.WindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/window")
public class WindowsController {

    @Autowired
    WindowService windowService;

    @GetMapping("/display")
    public List<WindowDto> displayWindow() {
        return windowService.findReferenceByPagination();
    }

    //@GetMapping("create-window")
    public String DispalyCreateWindow(Window window) {
        return "";
    }

//    @PostMapping("create")
//    public Window createwindow(@RequestBody Window window) {
//
//
//        //ModelAttribut est les information qu'on va recevoir a l'appel de cette methode qui est doffice instancier.
//        // go to confirm page window created...
//        // call methode add window in service, and send window.
//        return window;
//
//    }


//    @RequestMapping("/display")
//    public String displayWindow() {
//        System.out.println("Method displayWindow");
//        return " ";
//
//    }
}
