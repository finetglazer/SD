package org.example.systemdesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth2/")
public class Oauth2Controller {
    @GetMapping("/secure")
    public String hello() {
        return "Hello ";
    }

}
