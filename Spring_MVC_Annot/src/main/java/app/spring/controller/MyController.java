package app.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("hello", "Nikita");
        return "hello";
    }
}
