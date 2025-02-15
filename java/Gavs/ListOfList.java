package Gavs;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
	public static void main(String[] args) {
		
		
		List<Integer> al   = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		List<Integer> a2   = new ArrayList<>();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		
		List  a3  = new ArrayList<>();
		a3.add(al);
		a3.add(a2);
		
		System.out.println(a3);
		
		
	}

}
