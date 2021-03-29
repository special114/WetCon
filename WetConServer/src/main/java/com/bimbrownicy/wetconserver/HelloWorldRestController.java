package com.bimbrownicy.wetconserver;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldRestController {

    @GetMapping("/")
    public Response helloWorld() {
        return new Response();
    }
}
