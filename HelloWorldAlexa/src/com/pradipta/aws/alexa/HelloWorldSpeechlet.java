package com.pradipta.aws.alexa;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;

public class HelloWorldSpeechlet implements SpeechletV2 {

	@Override
	public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
		// TODO Auto-generated method stub
//		log.info("onLaunch requestId={}, sessionId={}",
//	            requestEnvelope.getRequest().getRequestId(),
//	            requestEnvelope.getSession().getSessionId());

	    Intent intent = requestEnvelope.getRequest().getIntent();
	    String intentName = (intent != null) ? intent.getName() : null;
	 
	    if ("HelloWorldIntent".equals(intentName)) {
	        return getHelloResponse();
	    } else {
	    	return null;
	    }
	}

	@Override
	public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private SpeechletResponse getHelloResponse() {
        String speechText = "Hello world";

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("HelloWorld");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }
}
