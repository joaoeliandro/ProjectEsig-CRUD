package com.esigproject.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectEsigController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}