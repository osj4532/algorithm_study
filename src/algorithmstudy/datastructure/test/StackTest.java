package algorithmstudy.datastructure.test;

import algorithmstudy.datastructure.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>(10);
		for(int i = 0; i < 21; i++) {
			s.push(i+1);
		}

		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(s.peek());
	}

}
