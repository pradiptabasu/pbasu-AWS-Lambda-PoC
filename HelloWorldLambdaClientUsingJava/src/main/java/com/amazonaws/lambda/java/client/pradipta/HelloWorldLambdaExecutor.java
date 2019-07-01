package com.amazonaws.lambda.java.client.pradipta;

public class HelloWorldLambdaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldSimpleImpl simpleObj = new HelloWorldSimpleImpl();
		simpleObj.executeHelloWorldSimple();
		
		HelloWorldComplexImpl complexObj = new HelloWorldComplexImpl();
		complexObj.executeHelloWorldComplex();
		
		HelloWorldComplexV2Impl complexV2Obj = new HelloWorldComplexV2Impl();
		complexV2Obj.executeHelloWorldComplexV2();
	}

}
