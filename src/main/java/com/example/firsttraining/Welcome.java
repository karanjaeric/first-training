/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.firsttraining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erick.karanja_cellul
 */
@RestController
@RequestMapping("/welcome")
public class Welcome {

    @GetMapping("/hello")
    public String hello() {
        return "Hello too";
    }

    @PostMapping("/sendgreeting")
    public String sendGreeting(@RequestBody String greeting) {
        return greeting + " too from the application";
    }

}
