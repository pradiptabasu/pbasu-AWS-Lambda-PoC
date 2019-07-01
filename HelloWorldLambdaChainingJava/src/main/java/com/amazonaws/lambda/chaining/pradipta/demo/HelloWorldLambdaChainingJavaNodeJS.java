package com.amazonaws.lambda.chaining.pradipta.demo;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambdaChainingJavaNodeJS implements RequestHandler<RequestClass, ResponseClassV2> {

    @Override
    public ResponseClassV2 handleRequest(RequestClass input, Context context) {
        context.getLogger().log("Input: " + input);
        final HelloWorldLambdaChainingJavaNodeJSService helloWorldComplexV2 = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldLambdaChainingJavaNodeJSService.class);
		ResponseClassV2 result = helloWorldComplexV2.HelloWorldLambdaChainingJavaNodeJS(input);
        return result;
    }

}
