package algorithmstudy.datastructure;

public class Queue {
	private int front = 0;
	private int rear = 0;
	private int[] array;
	private int size = 11;
	
	public Queue() {
		array = new int[size];
	}
	
	public Queue(int size) {
		array = new int[size+1];
		this.size = size+1;
	}
	
	public void add(int data) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			rear = (rear + 1) % size;
			array[rear] = data;
		}
	}
	
	public int peek() {
		return array[front+1];
	}
	
	public int poll() {
		int result = -1;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			front = (front + 1) % size;
			result = array[front];
		}
		return result;
	}
	
	public boolean isFull() {
		boolean result = false;
		if((rear+1) % size == front) {
			result = true;
		}
		return result;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(rear == front) {
			result = true;
		}
		return result;
	}
	
}
