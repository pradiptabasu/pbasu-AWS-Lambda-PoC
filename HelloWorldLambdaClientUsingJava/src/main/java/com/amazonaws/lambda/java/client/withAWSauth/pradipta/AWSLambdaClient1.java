package com.amazonaws.lambda.java.client.withAWSauth.pradipta;

import java.nio.charset.Charset;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambdaClient;
import com.amazonaws.services.lambda.model.InvokeRequest;

public class AWSLambdaClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Region region;
	    AWSLambdaClient lambdaClient;

	    lambdaClient = new AWSLambdaClient(new DefaultAWSCredentialsProviderChain());
	    region = Region.getRegion(Regions.fromName(regionName));
	    lambdaClient.setRegion(region);

	    InvokeRequest invokeRequest = new InvokeRequest();
	    invokeRequest.setFunctionName(FunctionName);
	    invokeRequest.setPayload(ipInput);


	    returnDetails = byteBufferToString(
	            lambdaClient.invoke(invokeRequest).getPayload(),
	            Charset.forName("UTF-8"),logger);
	}

}
