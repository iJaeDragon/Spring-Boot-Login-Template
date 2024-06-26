package me.shinsunyoung.springbootdeveloper.controller;

import me.shinsunyoung.springbootdeveloper.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserViewController {

    @GetMapping("/login")
    public String login() {
        return "oauthLogin";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/index")
    public String index(@AuthenticationPrincipal User user) {
        SecurityContextHolder.getContext().getAuthentication().getName();
        return "index";
    }

    @PostMapping("/main")
    @ResponseBody
    public String main(@AuthenticationPrincipal User user) {
        SecurityContextHolder.getContext().getAuthentication().getName();
        return "main";
    }

}
