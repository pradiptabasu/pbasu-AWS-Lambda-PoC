package com.amazonaws.lambda.chained.client.pradipta;

public class HelloWorldLambdaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldLambdaChainingNodeJSJavaImpl complexNodeJavaObj = new HelloWorldLambdaChainingNodeJSJavaImpl();
		complexNodeJavaObj.executeHelloWorldLambdaChainingNodeJSJava();
		
		HelloWorldLambdaChainingNodeJSNodeJSImpl complexNodeNodeObj = new HelloWorldLambdaChainingNodeJSNodeJSImpl();
		complexNodeNodeObj.executeHelloWorldLambdaChainingNodeJSNodeJS();
	}

}
