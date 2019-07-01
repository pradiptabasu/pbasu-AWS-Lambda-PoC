package com.amazonaws.lambda.chaining.pradipta.demo;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldLambdaChainingJavaJavaService {
	  @LambdaFunction(functionName="HelloWorldComplexV2")
	  ResponseClassV2 HelloWorldLambdaChainingJavaJava(RequestClass input);
}
