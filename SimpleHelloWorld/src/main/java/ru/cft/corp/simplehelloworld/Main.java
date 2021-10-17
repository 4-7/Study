package ru.cft.corp.simplehelloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.cft.corp.simplehelloworld.renders.MessageRender;

public class Main {
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:appContext.xml");

		MessageRender rend = context.getBean("messageRender", MessageRender.class);
		
		rend.render();

		context.close();
	}
}