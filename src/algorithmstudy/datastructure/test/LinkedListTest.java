package algorithmstudy.datastructure.test;

import algorithmstudy.datastructure.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFront(1);
		list.insertFront(2);
		list.insertFront(3);
		list.insertFront(4);
		list.insertFront(5);
		list.insertFront(6);
		
		while(!list.isEmpty()) {
			System.out.println(list.peek());
			System.out.println(list.deleteFront());
		}
		
	}

}
