/*INPUT TO LAMBDA    ---->      { "firstName":"Pradipta", "lastName":"Basu" }     */
package com.amazonaws.lambda.pradipta.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldComplex implements RequestHandler<RequestClass, ResponseClass> {

    @Override
    public ResponseClass handleRequest(RequestClass requestMsg, Context context) {
        context.getLogger().log("First Name: " + requestMsg.getFirstName());
        context.getLogger().log("Last Name: " + requestMsg.getLastName());
        // TODO: implement your handler
        String greetingString = String.format("Hello %s, %s !!!", requestMsg.firstName, requestMsg.lastName);
        return new ResponseClass(greetingString);
    }

}
