package ru.cft.corp.helloWorld;

public class HelloWorld {
	public static void Main{
		ApplicationContext context = new ClassPathXmlApplicationContext("");

		context.close();
	}
}