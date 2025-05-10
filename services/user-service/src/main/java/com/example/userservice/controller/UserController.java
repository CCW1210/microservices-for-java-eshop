package com.example.userservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  /** 1. 列表頁面 */
  @GetMapping
  public String listUsers(Model model) {
    model.addAttribute("users", userService.findAllUsers());
    return "user-list"; // 對應 /WEB-INF/jsp/user-list.jsp
  }

  /** 2. 顯示新增表單 */
  @GetMapping("/new")
  public String showForm(Model model) {
    model.addAttribute("user", new User());
    return "user-form"; // 對應 /WEB-INF/jsp/user-form.jsp
  }

  /** 3. 處理表單送出 */
  @PostMapping
  public String createUser(@ModelAttribute User user) {
    userService.createUser(user);
    return "redirect:/users";
  }
}
