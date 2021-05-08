package com.bimbrownicy.wetconserver;

import com.bimbrownicy.wetconserver.Entities.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldRestController {

    @Autowired
    private GreetingsRepository greetingsRepository;

    @GetMapping("/")
    public Response helloWorld() {
        Integer random = (int)(Math.random()*10)%(int) greetingsRepository.count();
            return new Response(greetingsRepository.findById(random).get().getText());
    }
}
