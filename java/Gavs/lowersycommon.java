package Gavs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lowersycommon {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };

		
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					al.add(arr1[i]);
				}
			}
		}
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al.get(0));
	}
}

