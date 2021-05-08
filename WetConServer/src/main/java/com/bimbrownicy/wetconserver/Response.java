package com.bimbrownicy.wetconserver;

public class Response {
    private String text = "Hello Panie Doktorze Łukaszu!";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Response() {}

    public Response(String text)
    {
        this.text = text;
    }
}
