package ru.kafpin.projectmanagmentapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/hello/{name}")
    public String helloByName(@PathVariable String name) {
        return "Hello!, " + name + "!";
    }

}
