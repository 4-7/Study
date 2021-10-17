package ru.cft.corp.simplehelloworld.renders;

import ru.cft.corp.simplehelloworld.providers.MessageProvider;

public class MessageRender implements IMessageRender {
	private MessageProvider provider;

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
	public void render() {
		if (provider != null) {
			System.out.println(provider.getMessage());
		} else {
			throw new RuntimeException("Не установлен провайдер сообщения!");
		}
	}
}