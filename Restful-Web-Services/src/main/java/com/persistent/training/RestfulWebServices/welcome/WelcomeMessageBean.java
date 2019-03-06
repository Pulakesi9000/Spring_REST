package com.persistent.training.RestfulWebServices.welcome;

public class WelcomeMessageBean {

	private String message;

	public WelcomeMessageBean(String message) {
		this.message  = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "WelcomeMessageBean [message=" + message + "]";
	}

	
}
