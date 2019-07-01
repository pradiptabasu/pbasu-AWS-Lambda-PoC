package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldComplexV2Service {
	  @LambdaFunction(functionName="HelloWorldComplexV2")
	  ResponseClassV2 HelloWorldComplexV2(RequestClass input);
}
