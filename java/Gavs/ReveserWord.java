package Gavs;

public class ReveserWord {
	public static void main(String[] args) {

		String s = "i do java program everyday";

		String arr[] = s.split(" ");

		String s1 = "";
		for (int i = arr.length - 1; i >= 0; i--) {

			s1 = s1 + arr[i] +" ";

		}

		System.out.println(s1);

	}

}
