package com.example.rezzadanial.earth;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class HelloEarthController { 
    @RequestMapping("/") public String helloearth() 
    { 
        String message = "Hello Earth!";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message += " From host: " + ip;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message;
    } 
}