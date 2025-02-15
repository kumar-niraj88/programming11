package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("goat")
public class goat implements Animal {
	
	public void sound() {
		System.out.println("may may");
	}

}
