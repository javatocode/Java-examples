package com.ingle.primitive;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/helloService")
public class HelloService {
	
@Path("/sayHello/{age1}")
@GET
public String sayHello(@QueryParam("name1") String name,@PathParam("age1") int age) {
	return "Hello" + name + "your age is"+age;
}
}

// http://loclhost:8084/restfulapijersey/rest/helloService/sayHello/21?name1=ajay
