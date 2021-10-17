package ru.cft.corp.simplehelloworld.renders;

import ru.cft.corp.simplehelloworld.Providers.MessageProvider;

public class MessageRender implements IMessageRender {
	private MessageProvider provider;

	public void setMessageProvider(MessageProvider messageProvider) {
		provider = messageProvider;
	}

	public void render(){
		if (provider != null) {
			System.out.println(provider.getMessage());
		} else {
			throw new RuntimeException("Не определен поставщик сообщений!");
		}
	}
}
