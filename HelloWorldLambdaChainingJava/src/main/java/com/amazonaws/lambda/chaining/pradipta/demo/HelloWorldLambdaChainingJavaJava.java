package com.amazonaws.lambda.chaining.pradipta.demo;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambdaChainingJavaJava implements RequestHandler<RequestClass, ResponseClassV2> {

    @Override
    public ResponseClassV2 handleRequest(RequestClass input, Context context) {
        context.getLogger().log("Input: " + input);
        final HelloWorldLambdaChainingJavaJavaService helloWorldComplexV2 = LambdaInvokerFactory.builder()
				 .lambdaClient(AWSLambdaClientBuilder.defaultClient())
				 .build(HelloWorldLambdaChainingJavaJavaService.class);
		ResponseClassV2 result = helloWorldComplexV2.HelloWorldLambdaChainingJavaJava(input);
        return result;
    }

}
