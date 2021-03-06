package com.ingle.Jsonconvert;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingle.modal.Address;
import com.ingle.modal.Student;
import com.ingle.service.JavatoJson;

public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
       //  convert java to json
    	ObjectMapper mapper1 = new ObjectMapper();
    	 mapper1.writeValue(new File("Student.json"), JavatoJson.javatojsonconvert());
    	System.out.println("Json is generated..");
    	
    	// convert json to java
    	ObjectMapper mapper2 = new ObjectMapper();
        Student s = mapper2.readValue(new File("Student.json"),Student.class);
        System.out.println("id : " + s.getSid());
        System.out.println("name : " + s.getSname());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Your Liked subject:");
        for(String st :s.getSubject()) {
        	
        	System.out.println(st);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Your address data");
        Address a = s.getAddress();
        System.out.println("City : " + a.getCity());
        System.out.println("Zipcode : " + a.getZipcode());
    }
}
