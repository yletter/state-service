package com.yuvaraj.stateservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/states")
public class UserController {
    @GetMapping
    public String getState() {
        return "State Service - List of States";
    }
}
