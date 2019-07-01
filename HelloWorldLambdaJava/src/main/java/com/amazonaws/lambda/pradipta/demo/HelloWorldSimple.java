/*INPUT TO LAMBDA    ---->      "Pradipta"   */

package com.amazonaws.lambda.pradipta.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldSimple implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        String output = "Hello, " + input + " !!!";
        return output;
    }

}
