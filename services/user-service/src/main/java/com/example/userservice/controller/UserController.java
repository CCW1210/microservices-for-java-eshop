package com.example.userservice.controller;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(\"/users\")
public class UserController {
    private final UserRepository repo;
    public UserController(UserRepository repo) { this.repo = repo; }

    @GetMapping
    public String listUsers(Model m) {
        m.addAttribute(\"users\", repo.findAll());
        return \"user-list\";
    }
    @GetMapping(\"/new\")
    public String showForm(Model m) {
        m.addAttribute(\"user\", new User());
        return \"user-form\";
    }
    @PostMapping
    public String create(@ModelAttribute User u) {
        repo.save(u);
        return \"redirect:/users\";
    }
}