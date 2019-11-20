package algorithmstudy.datastructure;

public class Stack<T> {
	private int top;
	private Object[] array;
	private int incrementSize = 10;
	
	public Stack() {
		array = new Object[incrementSize];
		top = -1;
	}
	
	public Stack(int size) {
		array = new Object[size];
		top = -1;
	}
	
	public void push(T data) {
		if(isFull()) {
			System.out.println("Stack is Full");
			System.out.println("So Stack size is increment");
			arrayIncrement();
		}
		array[++top] = data;
	}
	
	public Object peek() {
		try {
			return array[top];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is Empty!");
		}
		return -1;
	}
	
	public Object pop() {
		try {
			if(this.array.length - this.top > 10) {
				arrayDecrement();
				System.out.println("Stack size Decrement");
			}
			return array[top--];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is Empty!");
		}
		return -1;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(this.top == -1) {
			result = true;
		}
		
		return result;
	}
	
	public boolean isFull() {
		boolean result = false;
		if(this.top + 1 == this.array.length) {
			result = true;
		}
		return result;
	}
	
	public void arrayIncrement() {
		Object[] array = new Object[this.array.length + this.incrementSize];
		for(int i = 0; i <= top; i++) {
			array[i] = this.array[i];
		}
		this.array = array;
	}
	
	public void arrayDecrement() {
		Object[] array = new Object[this.array.length - this.incrementSize];
		for(int i = 0; i <= top; i++) {
			array[i] = this.array[i];
		}
		this.array = array;
	}
	
	public int getSize() {
		return top;
	}
}
