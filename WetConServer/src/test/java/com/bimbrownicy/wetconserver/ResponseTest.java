package com.bimbrownicy.wetconserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResponseTest {

    @Test
    public void returnTest() {
        Response response = new Response();
        assertEquals("Hello Adam!", response.getText());
    }

}