package dev.coffeeprog.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // does not do much besides identify as component
public class HomeController {
    @GetMapping
    public String home() {
        return "home";
    }
}