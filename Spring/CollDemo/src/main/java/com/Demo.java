package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("d")
public class Demo {
	
	@Autowired
	private List m1;
	
	@Autowired
	private List m2;
	
	@Autowired
	private Set s;
	
	@Autowired
	private Map<Integer, String> map;
	
	public void  details() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(s);
		System.out.println(map);
	}

}
