package com.amazonaws.lambda.java.client.withAWSauth.pradipta;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambdaAsyncClient;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;

public class AWSLamdbaClient3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AWSLambdaAsyncClient lambdaClient = new AWSLambdaAsyncClient();
	    lambdaClient.withRegion(Region.getRegion(Regions.US_WEST_2));
	    InvokeRequest invokeRequest = new InvokeRequest();
	    invokeRequest.setInvocationType("RequestResponse"); // ENUM RequestResponse or Event
	    invokeRequest.withFunctionName("FUNCTION NAME").withPayload(payload);
	    InvokeResult invoke = lambdaClient.invoke(invokeRequest);
	    try {
	        // PRINT THE RESPONSE
	        String val = new String(invoke.getPayload().array(), "UTF-8");
	        System.out.println("Response==> " + val);
	    } catch (Exception e) {
	        System.out.println("error");
	    }
	    
	}

}
