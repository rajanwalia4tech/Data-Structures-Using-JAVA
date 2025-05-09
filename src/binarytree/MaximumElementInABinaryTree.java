package binarytree;

public class MaximumElementInABinaryTree {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(70);
		root.right = new Node(30);
		root.right.left = new Node(60);
		root.right.right = new Node(50);
		int max = maximumElement(root);
		System.out.println(max);
	}
	
	// Time Complexity : theta(n) , n = no. of Nodes
	// Aux space : theta(h) , h = height of tree
	private static int maximumElement(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;
		int leftMaximum = maximumElement(root.left);
		int max = Math.max(root.data, leftMaximum);
		int rightMaximum = maximumElement(root.right);
		max = Math.max(max, rightMaximum);
		return max;
	}
}
