package Gavs;

import java.util.TreeSet;

public class MergeTwoarray {
	public static void main(String[] args) {

		int arr1[] = { 7, 5, 1, 3 };
		int arr2[] = { 6, 2, 8, 4 };

		TreeSet<Integer> t = new TreeSet<>();

		for (int i : arr1) {
			t.add(i);
		}
		for (int i : arr2) {
			t.add(i);
		}

		System.out.println(t);

	}

}

