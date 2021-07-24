package ai.tech.base.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping({ "home", "index" })
    public String home() {
        return "Hello, world! :D";
    }

    @GetMapping("/edit")
    public String edit() {
        return "Hello, world!";
    }
}