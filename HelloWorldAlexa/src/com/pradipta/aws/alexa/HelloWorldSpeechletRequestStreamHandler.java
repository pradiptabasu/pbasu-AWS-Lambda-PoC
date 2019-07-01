package com.pradipta.aws.alexa;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class HelloWorldSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();

//    static {
//        supportedApplicationIds.add("[unique-value-here]");
//    }

    public HelloWorldSpeechletRequestStreamHandler() {
        super(new HelloWorldSpeechlet(), supportedApplicationIds);
    }
}
