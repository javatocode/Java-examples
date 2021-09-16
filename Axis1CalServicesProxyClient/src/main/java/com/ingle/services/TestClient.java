package com.ingle.services;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException  {
		// TODO Auto-generated method stub

		java.net.URL url = new java.net.URL("http://localhost:8084/Axis1CalServices/services/CalServices?wsdl");
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		
		CalServicesSoapBindingStub  stub = new CalServicesSoapBindingStub(url,service);
		int result = stub.add(10, 10);
		System.out.println("Addition is " + result);
	}

}
