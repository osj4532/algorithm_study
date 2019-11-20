package algorithmstudy.book;

import java.util.Stack;

public class CheckNesting {

	public static boolean checkNestingByStack(String in) {
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < in.length(); i++) {
			char item = in.charAt(i);
			if(item == ')') {
				s.add(item);
			}else {
				if(!s.isEmpty())
					s.pop();
			}
		}
		
		return s.isEmpty();
	}
	
	public static boolean checkNestingByCount(String in) {
		int count = 0;
		for(int i = 0; i < in.length(); i++) {
			char item = in.charAt(i);
			if(item == '(')
				count++;
			else {
				count--;
				if(count < 0)
					return false;
			}
		}
		
		return count == 0;
	}
	
	public static void main(String[] args) {
		String in = "(()())())(";
		System.out.println(checkNestingByStack(in));
		System.out.println(checkNestingByCount(in));
	}

}
