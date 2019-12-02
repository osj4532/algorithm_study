package algorithmstudy.programmers;

import java.util.Arrays;
import java.util.Comparator;

class Solution12915 {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				char c1 = o1.charAt(n);
				char c2 = o2.charAt(n);
				int result = 0;
				if(c1 == c2) result = o1.compareTo(o2);
				else result = c1 - c2;
				return result;
			}
		});
		return strings;
	}
}

public class Programmers12915 {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		Solution12915 sol = new Solution12915();
		for(String str : sol.solution(strings, n)) {
			System.out.print(str+" ");
		}
	}

}
