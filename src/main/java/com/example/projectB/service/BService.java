package com.example.projectB.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BService {
    @GetMapping("/bonjour")
    public String bonjour(){
        return "bonjour";
    }
}
