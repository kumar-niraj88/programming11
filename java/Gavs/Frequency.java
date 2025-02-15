package Gavs;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency{
	
	public static void main(String[] args) {
		
		String  s  ="programming";
		
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		for(int i  =0; i<s.length(); i++) {
			
			char c  =  s.charAt(i);
				Integer  value  =   m.get(c);
			if(value == null) {
				m.put(c, 1);
			}else {
				m.put(c, value +1);
			}
		}System.out.println(m);
	}
}
