package binarytree;

// Return the no. of nodes in a Binary Tree

public class SizeOfBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		int size = getSize(root);
		System.out.println(size);
	}
	// Time Complexity : theta(n) , n = no. of Nodes
	// Aux space : theta(h) , h = height of tree
	private static int getSize(Node root) {
		if(root ==  null)
			return 0;
		int leftCount = getSize(root.left);
		int rightCount = getSize(root.right);
		return leftCount + rightCount + 1;
	}
}
