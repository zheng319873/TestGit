package com.sdzsq.web.controller;

import com.sdzsq.pojo.Users;
import com.sdzsq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/addUser")
    public String addUser(Users users){
         this.userService.addUser(users);
        return "one";
    }
}
