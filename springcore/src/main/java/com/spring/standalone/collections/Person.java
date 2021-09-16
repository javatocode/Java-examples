package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
private List<String> friends;
private Map<String,Integer> feestr;

public List<String> getFriends() {
	return friends;
}

public Map<String, Integer> getFeestr() {
	return feestr;
}

public void setFeestr(Map<String, Integer> feestr) {
	this.feestr = feestr;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}




public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(List<String> friends, Map<String, Integer> feestr) {
	super();
	this.friends = friends;
	this.feestr = feestr;
}

@Override
public String toString() {
	return "Person [friends=" + friends + "]";
}



}
