package com.amazonaws.lambda.pradipta.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class HelloWorldComplexTest {

    private static String  firstname;
    private static String  lastname;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
    	firstname = null;
    	lastname = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testHelloWorldComplex() {
        HelloWorldComplex handler = new HelloWorldComplex();
        Context ctx = createContext();
        RequestClass requestMsg = new RequestClass(firstname,lastname);
        ResponseClass output = handler.handleRequest(requestMsg, ctx);
        String greetings = output.getGreetings();
        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!", output);
    }
}
