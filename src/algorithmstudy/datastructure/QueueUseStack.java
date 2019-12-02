package algorithmstudy.datastructure;

import java.util.Stack;

public class QueueUseStack {
	private Stack<Integer> inStack = new Stack<Integer>(); 
	private Stack<Integer> outStack = new Stack<Integer>();
	
	public void push(int data) {
		inStack.push(data);
	}
	
	public int pop() {
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
	public boolean isEmpty() {
		boolean isEmpty = false;
		if(inStack.isEmpty() && outStack.isEmpty())
			isEmpty = true;
		return isEmpty;
	}
}
