package com.bimbrownicy.wetconserver.Entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GreetingsRepository extends CrudRepository<Greeting, Integer> {

    Optional<Greeting> findById(Integer id);
    List<Greeting> findByText(String text);
}
