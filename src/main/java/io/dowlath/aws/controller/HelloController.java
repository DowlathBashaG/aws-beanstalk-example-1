package io.dowlath.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Dowlath
 * @create 5/30/2020 11:44 PM
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello Dowlath Basha G welcomes you....!!!";
    }
}
