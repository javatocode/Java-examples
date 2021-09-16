package com.ingle.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ingle.services.CalServicesI",
serviceName = "CalServiceImp")
public class CalServicesImp implements CalServicesI{

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
