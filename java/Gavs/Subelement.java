package Gavs;

import java.util.ArrayList;
import java.util.List;

public class Subelement {

	public static void main(String[] args) {
		
		List<Integer> al   = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		List<Integer> a2   = new ArrayList<>();
		a2.add(3);
		a2.add(4);
		
		
		System.out.println(al.containsAll(a2));
		
	}
}
