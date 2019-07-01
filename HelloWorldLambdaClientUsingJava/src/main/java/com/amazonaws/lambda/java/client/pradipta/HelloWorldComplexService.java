package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldComplexService {
	  @LambdaFunction(functionName="HelloWorldComplex")
	  ResponseClass HelloWorldComplex(RequestClass input);
}
