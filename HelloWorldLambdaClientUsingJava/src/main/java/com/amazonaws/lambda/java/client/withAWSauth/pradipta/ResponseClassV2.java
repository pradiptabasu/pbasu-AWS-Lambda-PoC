package com.amazonaws.lambda.java.client.withAWSauth.pradipta;

public class ResponseClassV2 {
	String greetings;
	String greetingsV2;

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public String getGreetingsV2() {
		return greetingsV2;
	}

	public void setGreetingsV2(String greetingsV2) {
		this.greetingsV2 = greetingsV2;
	}

	public ResponseClassV2(String greetings, String greetingsV2) {
		this.greetings = greetings;
		this.greetingsV2 = greetingsV2;
	}

	public ResponseClassV2() {
	}

}
