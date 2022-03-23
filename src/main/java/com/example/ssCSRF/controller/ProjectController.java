package com.example.ssCSRF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {

    @GetMapping
    public String main(){
        return "main.html";
    }
    //post,put delete mutatingaction in rest
    @PostMapping("/change")
    public String doSmtg(){
        System.out.println(":( is done");
        return "main.html";
    }
}
