package com.spring.removeconfig;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.removeconfig")
public class JavaConfig {
	
	@Bean(name= {"emp1"})
	public Employee getEmp() {
		return new Employee();
	}
	@Bean(name= {"lemp"})
    public List<Integer> rateList() {
        return Arrays.asList(1,2,3,4,5);
    }
	@Bean(name= {"memp"})
    public Map<String,Integer> marksMap() {
		Map<String,Integer>  mMap = new HashMap<String,Integer>();
	    mMap.put("DSA",100);
	    mMap.put("COA",89);
	    mMap.put("DBMS",60);
	    return mMap;
    }
	
}
