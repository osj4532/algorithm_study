package algorithmstudy.search;

public class BinaryTreeTraversal {
	public void preOrder(BinaryTreeNode root) {
		if(root == null) return;
		
		System.out.print(root.getData() +" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public void inOrder(BinaryTreeNode root) {
		if(root == null) return;
		
		inOrder(root.getLeft());
		System.out.print(root.getData() +" ");
		inOrder(root.getRight());
	}

	public void postOrder(BinaryTreeNode root) {
		if(root == null) return;
		
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() +" ");
	}
}
