package algorithmstudy.book;

import algorithmstudy.datastructure.Node;

public class LinkedListHeadTail {

	private Node head;
	private Node tail;
	
	public boolean delete(Node delNode) {
		Node curNode = head;
		
		if(delNode == null) return false;
		
		if(delNode == head) {
			head = delNode.getNextNode();
			
			if(head == null)
				tail = null;
			
			return true;
		}
		
		while(curNode != null) {
			if(curNode.getNextNode() == delNode) {
				curNode.setNextNode(delNode.getNextNode());
				return true;
			}
			
			if(curNode.getNextNode() == null)
				tail = curNode;
			curNode = curNode.getNextNode();
		}
		
		return false;
	}
	
	public boolean insertAfter(Node beforeNode, int data) {
		Node curNode = head, newNode;
		
		newNode = new Node(data);
		
		if(beforeNode == null) {
			newNode.setNextNode(head);
			head = newNode;
			
			if(tail == null) {
				tail = newNode;
			}
			return true;
		}
		
		while(curNode != null) {
			if(curNode == beforeNode) {
				newNode.setNextNode(curNode.getNextNode());
				curNode.setNextNode(newNode);
				
				if(newNode.getNextNode() == null) {
					tail = newNode;
				}
				return true;
			}
			curNode = curNode.getNextNode();
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
