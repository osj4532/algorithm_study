package algorithmstudy.search.test;

import java.util.ArrayList;
import java.util.List;

import algorithmstudy.search.BinaryTreeNode;
import algorithmstudy.search.BinaryTreeTraversal;

public class BinaryTreeTest {
	public static void main(String[] args) {
		List<BinaryTreeNode> tree = new ArrayList<BinaryTreeNode>();
		for(int i = 1; i <= 15; i++) {
			tree.add(new BinaryTreeNode(i));
		}
		
		for(int i = 0; i < 15/2; i++) {
			BinaryTreeNode node = tree.get(i);
			node.setLeft(tree.get(i * 2 + 1));
			node.setRight(tree.get(i * 2 + 2));
		}
		
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		btt.preOrder(tree.get(0)); System.out.println();
		btt.inOrder(tree.get(0)); System.out.println();
		btt.postOrder(tree.get(0)); System.out.println();
	}
}
