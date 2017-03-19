package com.adventurexplorers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by thuwarakesh on 2/28/17.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/services")
    public String services(){
        return "services";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "blog";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

}
