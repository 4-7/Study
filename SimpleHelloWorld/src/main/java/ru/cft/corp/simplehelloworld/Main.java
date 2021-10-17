package ru.cft.corp.simplehelloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:appContext.xml");

		context.close();
	}
}