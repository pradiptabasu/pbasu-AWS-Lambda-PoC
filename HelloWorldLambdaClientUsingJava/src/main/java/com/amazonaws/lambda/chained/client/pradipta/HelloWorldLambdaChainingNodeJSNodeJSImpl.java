package com.amazonaws.lambda.chained.client.pradipta;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class HelloWorldLambdaChainingNodeJSNodeJSImpl {
	public void executeHelloWorldLambdaChainingNodeJSNodeJS()
	{
		final HelloWorldLambdaChainingNodeJSNodeJSService helloWorldComplexV2 = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldLambdaChainingNodeJSNodeJSService.class);
		RequestClass input = new RequestClass();
		input.setFirstName("Pradipta");
		input.setLastName("Basu");

		ResponseClassV2 result = helloWorldComplexV2.HelloWorldLambdaChainingNodeJSNodeJS(input);
		
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetings());
		System.out.println("Result from helloWorldComplexV2 : " + result.getGreetingsV2());
	}
}
