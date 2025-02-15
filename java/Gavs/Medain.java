package Gavs;

import java.util.Arrays;


public class Medain {
	public static void main(String[] args) {
		// 0,1,2,3,4
		int arr1[] = { 1, 3, 8, 11, 15 }; //
		int arr2[] = { 7, 9, 18, 19, 21, 25 };

		int merge[] = new int[arr1.length + arr2.length];

		int n = 0;
		int m = 0;

		for (int i = 0; i < merge.length; i++) {

			if (n < arr1.length) {
				merge[i] = arr1[n++];
			} else if (m < arr2.length) {
				merge[i] = arr2[m++];
			}

		}

		Arrays.sort(merge);

		int med = merge.length / 2;

		System.out.println(merge[med] + merge[med+1] /2 );

	}

}

