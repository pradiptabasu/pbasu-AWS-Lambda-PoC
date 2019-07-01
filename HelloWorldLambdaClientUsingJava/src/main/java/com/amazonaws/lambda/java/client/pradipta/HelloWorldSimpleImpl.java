package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class HelloWorldSimpleImpl {
	public void executeHelloWorldSimple()
	{
		final HelloWorldSimpleService helloWorldSimple = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldSimpleService.class);
		RequestClass input = new RequestClass();
		input.setFirstName("Pradipta");
		input.setLastName("Basu");

		String result = helloWorldSimple.HelloWorldSimple(input);
		
		System.out.println("Result from helloWorldSimple : " + result);
	}
}
