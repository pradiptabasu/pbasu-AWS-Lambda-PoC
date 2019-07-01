package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class HelloWorldComplexImpl {
	public void executeHelloWorldComplex()
	{
		final HelloWorldComplexService helloWorldComplex = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldComplexService.class);
		RequestClass input = new RequestClass();
		input.setFirstName("Pradipta");
		input.setLastName("Basu");

		ResponseClass result = helloWorldComplex.HelloWorldComplex(input);
		
		System.out.println("Result from helloWorldComplex : " + result.getGreetings());
	}
}
