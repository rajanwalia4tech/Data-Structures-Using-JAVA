package binarytree;

public class HeightOfABinaryTree {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(70);
		root.right = new Node(30);
		root.right.left = new Node(60);
		root.right.right = new Node(50);
		root.left.right.left = new Node(33);
		int h = height(root);
		System.out.println(h);
	}
	// Time Complexity : theta(n) , n = no. of Nodes
	// Aux space : theta(h) , h = height of tree
	private static int height(Node root) {
		if(root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int maxHeight = Math.max(leftHeight, rightHeight);
		return maxHeight + 1;
	}
	
}
