package ru.cft.corp.helloWorld;

import org.springframework.context.ApplicationContext;

public class HelloWorld {
	public static void Main{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

		context.close();
	}
}