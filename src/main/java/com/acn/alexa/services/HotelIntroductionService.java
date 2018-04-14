package com.acn.alexa.services;

import java.net.URL;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class HotelIntroductionService {
	

	public static void createReqForBasicInformation(String code) {
		prepareAnURL(code, BASIC_INFORMATION);
		HttpGet  wsReq = new HttpGet()
	}
	
	public static URL prepareAnURL(String code, String queryString) {
		URL url = new URL()
		return url;
	}

}
