package com.amazonaws.lambda.java.client.withAWSauth.pradipta;

public class ResponseClass {
	String greetings;

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public ResponseClass(String greetings) {
		this.greetings = greetings;
	}

	public ResponseClass() {
	}

}
