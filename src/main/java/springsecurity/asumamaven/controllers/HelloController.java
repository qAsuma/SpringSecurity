package springsecurity.asumamaven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "PEPE CLAP!";
    }


    @GetMapping("/hello")
    public String sayhello() {
        return "/welcome";
    }


}
