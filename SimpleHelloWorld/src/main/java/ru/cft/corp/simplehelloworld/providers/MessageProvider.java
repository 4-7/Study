package ru.cft.corp.simplehelloworld.providers;

public class MessageProvider implements IMessageProvider {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
