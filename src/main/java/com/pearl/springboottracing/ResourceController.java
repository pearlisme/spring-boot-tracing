package com.pearl.springboottracing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello world";
    }
}
