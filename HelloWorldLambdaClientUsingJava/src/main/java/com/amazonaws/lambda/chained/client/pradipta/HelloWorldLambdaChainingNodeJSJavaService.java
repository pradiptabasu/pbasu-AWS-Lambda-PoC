package com.amazonaws.lambda.chained.client.pradipta;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldLambdaChainingNodeJSJavaService {
	  @LambdaFunction(functionName="HelloWorldLambdaChainingNodeJSJava")
	  ResponseClassV2 HelloWorldLambdaChainingNodeJSJava(RequestClass input);
}
