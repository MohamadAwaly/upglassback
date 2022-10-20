package be.upglassback.core.controller;

import be.upglassback.core.connection.EMF;
import be.upglassback.core.entities.Window;
import be.upglassback.core.services.WindowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
//@RequestMapping("/window")
public class WindowsController {

    WindowService windowService = new WindowService();

    @RequestMapping("/display")
    public String displayWindow() {
        EntityManager em = EMF.getEM();

        List<Integer> ids = windowService.windowsIds(em);

        for (int i : ids) {
            System.out.println("i : " +  i);
        }

        System.out.println("Method displayWindow");
        return " ";

    }

//    @RequestMapping("/display")
//    public String displayWindow() {
//        System.out.println("Method displayWindow");
//        return " ";
//
//    }
}
