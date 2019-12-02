package algorithmstudy.datastructure;

public class LinkedList {
	Node head;
	int size;
	
	public void insertFront(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
		size++;
	}
	
	public int peek() {
		if(head == null) return -1;
		return head.getData();
	}
	
	public int deleteFront() {
		if(head == null) return -1;
		
		int val = head.getData();
		Node newHeadNode = head.getNextNode();
		head.setNextNode(null);
		head = newHeadNode;
		return val;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(head == null)
			result = true;
		return result;
	}
	
	public Node getHead() {
		return this.head;
	}
	
}
