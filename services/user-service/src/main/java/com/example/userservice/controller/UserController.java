package com.example.userservice.controller;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(\"/users\")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model m) {
        m.addAttribute(\"users\", userService.findAllUsers());
        return \"user-list\";
    }

    @GetMapping(\"/new\")
    public String showForm(Model m) {
        m.addAttribute(\"user\", new User());
        return \"user-form\";
    }

    @PostMapping
    public String create(@ModelAttribute User u) {
        userService.createUser(u);
        return \"redirect:/users\";
    }
}
