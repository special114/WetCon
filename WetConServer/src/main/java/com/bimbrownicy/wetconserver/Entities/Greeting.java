package com.bimbrownicy.wetconserver.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Greetings")
public class Greeting {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false, length = 100)
    private String text;

    public Greeting() {}

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Greeting(String text)
    {
        this.text = text;
    }
}

