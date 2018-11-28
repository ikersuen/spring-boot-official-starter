package com.oocl.web.sampleWebApp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URI;

@Controller
public class SampleController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @PostMapping("/users")
    public ResponseEntity<String> addUser(User user) {
        return ResponseEntity.created(URI.create("/users/"+user.getUsername())).body("Hello World");
    }
}