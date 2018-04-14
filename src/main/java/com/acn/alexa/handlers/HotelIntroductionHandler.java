package com.acn.alexa.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class HotelIntroductionHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("HotelIntroductionIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
