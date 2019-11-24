package algorithmstudy.book;

import java.util.HashMap;
import java.util.Map;

public class NotDupleChar {
	//O(N)
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String in = "total";
		
		for(int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			map.put(ch+"", map.getOrDefault(ch+"", 0) + 1);
		}
		
		for(int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			if(map.get(ch+"") == 1) {
				System.out.println(ch);
				break;
			}
		}
	}
}
