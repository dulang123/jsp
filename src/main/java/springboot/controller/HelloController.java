package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(){
        System.err.println("***********");
        return "index";
    }
    @GetMapping("/buy")
    public String buy(){
        System.err.println("***********");
        return "login";
    }
}
