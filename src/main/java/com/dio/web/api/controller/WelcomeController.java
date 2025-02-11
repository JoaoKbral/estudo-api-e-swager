package com.dio.web.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web Api";
    }

    @GetMapping("/user")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/admin")
    public String admins(){
        return "Authorized admin";
    }
}
