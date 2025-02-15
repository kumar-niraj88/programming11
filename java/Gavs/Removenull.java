package Gavs;

import java.util.ArrayList;
import java.util.List;

public class Removenull {
	public static void main(String[] args) {
		
		List<String>  al  = new ArrayList<>();
		al.add(null);
		al.add("java");
		al.add(null);
		al.add("python");
		al.add("c++");
		
		System.out.println(al);
		
		for(int i = 0; i<al.size();i++) {
			if(al.get(i) ==  null) {
				al.remove(i);
			}
		}
		System.out.println(al);
	}
}

