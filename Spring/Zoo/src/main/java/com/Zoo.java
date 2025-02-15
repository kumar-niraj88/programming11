package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Z")
public class Zoo {
 
	@Autowired
	@Qualifier("goat")
	private Animal animal1;
	
	@Autowired
	@Qualifier("dog")
	private Animal animal2;
	
	public void getAnimalSound() {
		animal1.sound();
		animal2.sound();
	}
}
