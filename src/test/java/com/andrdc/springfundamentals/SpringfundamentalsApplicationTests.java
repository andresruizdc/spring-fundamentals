package com.andrdc.springfundamentals;

import com.andrdc.springfundamentals.json.Greet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringfundamentalsApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void autoWiringWorks() {
		assertNotNull(context);
		System.out.println(context.getClass().getName());
	}

	@Test
	void contextLoads() {
		final int count = context.getBeanDefinitionCount();
		System.out.printf("There are %s beans in the application context%n", count);
		for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

	@Test @Disabled
	void noGreetInApplicationContext() {
		assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(Greet.class));
	}

	@Test
	void getBeanTwice() {
		Greet greet1 = context.getBean("defaultGreet", Greet.class);
		Greet greet2 = context.getBean("whatUpGreet", Greet.class);
		assertNotSame(greet1, greet2);
	}
}