package com.example.rezzadanial.earth;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class HelloEarthController { 
    @RequestMapping("/") public String helloearth() 
    { 
        return "Hello Earth"; 
    } 
}