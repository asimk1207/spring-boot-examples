package com.example.cache.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MainController {

	@RequestMapping("/home")
    public @ResponseBody String home() {
        return "Welcome !!!";
    }
	
}
