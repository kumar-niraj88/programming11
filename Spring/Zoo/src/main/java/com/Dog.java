package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal{
	
	public void sound() {
		System.out.println("bark bark");
	}

}
