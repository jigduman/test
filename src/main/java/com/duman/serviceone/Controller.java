package com.duman.serviceone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {
    @GetMapping("/info")
    public String getUserInfo() {
        return "User Information";
    }
}
