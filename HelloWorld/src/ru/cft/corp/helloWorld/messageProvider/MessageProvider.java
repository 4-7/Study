package ru.cft.corp.helloWorld.messageProvider;

public class MessageProvider implements IMessageProvider {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
