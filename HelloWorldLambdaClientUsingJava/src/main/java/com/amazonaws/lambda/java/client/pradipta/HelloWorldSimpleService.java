package com.amazonaws.lambda.java.client.pradipta;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldSimpleService {
	  @LambdaFunction(functionName="HelloWorldSimple")
	  String HelloWorldSimple(RequestClass input);
}
