package com.amazonaws.lambda.chaining.pradipta.demo;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldLambdaChainingJavaNodeJSService {
	  @LambdaFunction(functionName="HelloWorldLambdaNodeJS")
	  ResponseClassV2 HelloWorldLambdaChainingJavaNodeJS(RequestClass input);
}
