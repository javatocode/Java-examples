package com.ingle.client.primitive;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClient {
	public static void main(String[] args) {
		Client c = Client.create();
		WebResource r1 = c.resource("http://localhost:8084/restfulapijersey/rest/helloService/sayHello/21?name1=ajay");
		String res = r1.get(String.class);
		System.out.println(res);
	}


}
