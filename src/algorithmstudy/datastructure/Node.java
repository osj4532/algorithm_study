package algorithmstudy.datastructure;

public class Node {
	private int data;
	private Node prevNode;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public Node getPrevNode() {
		return prevNode;
	}


	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}


	public Node getNextNode() {
		return nextNode;
	}


	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return data+"";
	}
}
