package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	
	@Bean
	public List m1() {
		
		ArrayList  al = new ArrayList();
		
		al.add(12);
		al.add("niraj");
		al.add(12);
		al.add(false);
		
		return al;
	}

	@Bean
	public List m2() {
		
		ArrayList  al = new ArrayList();
		
		al.add(43);
		al.add("niraj");
		al.add(3);
		al.add(true);
		
		return al;
	}
	@Bean
	public Set s() {
		
		
		Set set = new LinkedHashSet();
		set.add(1);
		set.add(3);
		
		
		
		return set;
		
	}
	
	@Bean
	Map<Integer, String> map(){
		Map<Integer, String> maps = new LinkedHashMap<Integer, String>();
		
		maps.put(1, "niraj");
		maps.put(2, "prince");
		maps.put(3, "suraj");
		
		
		
		return maps;
	}
}
