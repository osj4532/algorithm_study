package algorithmstudy.book;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class MyThread2 implements Runnable{
	private BlockingQueue<Integer> bq;
	public MyThread2(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(bq.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}

class MyThread implements Runnable{
	//private ThreadSafeQueue tsq;
	private BlockingQueue<Integer> bq;
	private static int count = 1;
	private int id;
	
	public MyThread(BlockingQueue<Integer> bq) {
		this.id = count++;
		this.bq = bq;
	}
	
	@Override
	public void run() {
		for(int i = 1; i < 10; i++) {
			try {
				System.out.println(id + " " + i + " ");
				bq.put(i);
			
				Thread.sleep((int)(Math.random() * 1000) + 1000);
			}catch (InterruptedException e) {}
		}
	}
}

public class ThreadSafeQueue {
	private int size = 10;
	private int[] arr = new int[size];
	private int front = 0, rear = 0;
	
	public synchronized void offer(int data) {
		if(isFull()) {
			System.out.println("queue is full!!");
			return;
		}
			
		rear = (rear + 1) % size;
		arr[rear] = data;
	}
	
	public int peek() {
		return arr[front+1];
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("queue is empty!!");
			return -1;
		}
		synchronized (arr) {
			front = (front + 1) % size;
			return arr[front];
		}
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return (rear + 1) % size == front;
	}
	
	public int getRear() {
		return this.rear;
	}
	
	public static void main(String[] args) {
		ThreadSafeQueue tsq = new ThreadSafeQueue();
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
		Thread myTread1 = new Thread(new MyThread(bq));
		Thread myTread2 = new Thread(new MyThread(bq));
		Thread myTread3 = new Thread(new MyThread2(bq));
		myTread1.start();
		myTread2.start();
		myTread3.start();
	}

}
