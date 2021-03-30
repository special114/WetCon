package com.bimbrownicy.wetconserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResponseTests {

    @Test
    public void returnTest() {
        Response response = new Response();
        System.out.println(response.getText());
        assertEquals("Hello World!", response.getText());
    }

}
