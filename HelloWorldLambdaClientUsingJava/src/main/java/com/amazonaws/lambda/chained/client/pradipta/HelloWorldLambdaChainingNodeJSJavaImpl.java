package com.amazonaws.lambda.chained.client.pradipta;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class HelloWorldLambdaChainingNodeJSJavaImpl {
	public void executeHelloWorldLambdaChainingNodeJSJava()
	{
		final HelloWorldLambdaChainingNodeJSJavaService helloWorldComplexV2 = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldLambdaChainingNodeJSJavaService.class);
		RequestClass input = new RequestClass();
		input.setFirstName("Pradipta");
		input.setLastName("Basu");

		ResponseClassV2 result = helloWorldComplexV2.HelloWorldLambdaChainingNodeJSJava(input);
		
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetings());
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetingsV2());
	}
}
