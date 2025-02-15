package Gavs;
import java.util.*;
public class Balanced {

	static boolean isbalanced(String s) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '[' || c == '{' || c == '(') {
				st.push(c);
			} else {

				if (!st.isEmpty()) {

					if (c == ')') {
						if (st.peek() == '(') {
							st.pop();
						} else {
							return false;
						}

					} else if (c == ']') {
						if (st.peek() == '[') {
							st.pop();
						} else {
							return false;
						}

					} else if (c == '}') {
						if (st.peek() == '{') {
							st.pop();
						} else {
							return false;
						}

					}

				}

			}
		}

		return st.isEmpty();

	}

	public static void main(String[] args) {

		System.out.println(isbalanced(")("));
		System.out.println(isbalanced("({)}"));
		System.out.println(isbalanced("(())"));
		System.out.println(isbalanced(")()("));
		System.out.println(isbalanced("([{}])"));

	}

}

