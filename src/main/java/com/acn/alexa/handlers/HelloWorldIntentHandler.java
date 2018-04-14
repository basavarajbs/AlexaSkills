package com.acn.alexa.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;
import java.util.function.Predicate;

import com.amazon.ask.Skill;
import com.amazon.ask.builder.StandardSkillBuilder;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.services.Serializer;
import com.amazon.ask.request.Predicates;
import com.amazon.ask.util.JacksonSerializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;

public class HelloWorldIntentHandler implements RequestHandler {
	
	
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("HelloWorldIntent"));
	}
	
	public Optional<Response> handle(HandlerInput input) {
		String response = "Hello World";
		return input.getResponseBuilder().withSpeech(response).withSimpleCard("HelloWorld", response).build();
	}
	

}
