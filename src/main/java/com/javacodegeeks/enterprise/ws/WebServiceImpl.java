package com.javacodegeeks.enterprise.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.javacodegeeks.enterprise.ws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return "hello from printMessage";
	}

}
