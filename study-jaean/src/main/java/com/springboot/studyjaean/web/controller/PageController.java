package com.springboot.studyjaean.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping({"/", "index"})
    public String getIndex() {return "index";}
    @GetMapping("/test")
    @ResponseBody
    public String testResponseBody(String input) {return input;}

}

