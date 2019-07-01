package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class HelloWorldComplexV2Impl {
	public void executeHelloWorldComplexV2()
	{
		final HelloWorldComplexV2Service helloWorldComplexV2 = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldComplexV2Service.class);
		RequestClass input = new RequestClass();
		input.setFirstName("Pradipta");
		input.setLastName("Basu");

		ResponseClassV2 result = helloWorldComplexV2.HelloWorldComplexV2(input);
		
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetings());
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetingsV2());
	}
}
