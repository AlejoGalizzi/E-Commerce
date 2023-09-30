package com.alejogalizzi.ecommerceFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String getWebPage() {
        return "index";
    }
}
