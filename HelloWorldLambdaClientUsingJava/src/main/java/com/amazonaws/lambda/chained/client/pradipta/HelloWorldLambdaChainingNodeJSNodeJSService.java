package com.amazonaws.lambda.chained.client.pradipta;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface HelloWorldLambdaChainingNodeJSNodeJSService {
	  @LambdaFunction(functionName="HelloWorldLambdaChainingNodeJSNodeJS")
	  ResponseClassV2 HelloWorldLambdaChainingNodeJSNodeJS(RequestClass input);
}
