package ai.tech.base.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping({ "home", "index" })
    public String home() {
        return "index";
    }

    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }

    @GetMapping("/view/{username}")
    public String view(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "profile-templates/thomas-hardy/index";
    }
}