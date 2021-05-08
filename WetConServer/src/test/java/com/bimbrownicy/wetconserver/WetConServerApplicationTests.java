package com.bimbrownicy.wetconserver;

import com.bimbrownicy.wetconserver.Entities.Greeting;
import com.bimbrownicy.wetconserver.Entities.GreetingsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WetConServerApplicationTests {

	@Autowired
	private GreetingsRepository greetingsRepository;

	@Test
	void contextLoads() {
		int CountBefore = (int) greetingsRepository.findByText("New Test Text").size();
		greetingsRepository.save(new Greeting("New Test Text"));
		int CountAfter = (int) greetingsRepository.findByText("New Test Text").size();
		assertEquals(CountBefore+1, CountAfter);
		greetingsRepository.delete(greetingsRepository.findByText("New Test Text").get(0));
		assertEquals(CountBefore, greetingsRepository.findByText("New Test Text").size());
	}

}
