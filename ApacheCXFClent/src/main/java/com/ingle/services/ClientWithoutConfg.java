//package com.ingle.services;
//
//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//
//public class ClientWithoutConfg {
//public static void main(String[] args) {
//	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//	factory.setAddress("http://localhost:8084/ApacheCXFCalService/services/CalServicePort");
//	factory.setServiceClass(CalService.class);
//	Calservice service = factory.create();
//	System.out.println(service.add(12,1));
// }
//}
