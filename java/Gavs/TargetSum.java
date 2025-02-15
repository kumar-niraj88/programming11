package Gavs;
public class TargetSum {
	public static void main(String[] args) {
		
		int arr[] = {2,7,11,6,15,4,5,3};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if((arr[i] +arr[j]) ==  9 ) {
					
					System.out.println(arr[i] + " + " + arr[j]  + " =  9");
					
				}
			}
		}
	}
	}

