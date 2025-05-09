package binarytree;

import java.util.Stack;

public class Traversals {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		System.out.println("Recursive Traversal\n");
		System.out.println("InOrder Traversal : ");
		printInorder(root);
		System.out.println("\nPreOrder Traversal : ");
		printPreorder(root);
		System.out.println("\nPostOrder Traversal : ");
		printPostorder(root);
		System.out.println("\n\nIterative Traversal\n");
		System.out.println("InOrder Traversal : ");
		iterativeInorder(root);
		System.out.println("\nPreOrder Traversal : ");
		iterativePreorder(root);
	}

	/* Time for Below DFS Binary Tree iterative Travesal is O(n) || theta(n)
	 * Auxiliary Space : O(height of tree) || theta(height of tree)
	 */
	
	private static void iterativeInorder(Node root) {
		Stack<Node> s = new Stack();
		Node curr = root;
		while(curr!=null || s.isEmpty()==false) {
			while(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data+" ");
			curr = curr.right;
		}
	}
	
	//Preorder Time Complexity: O(N) 
	//Preorder Auxiliary Space: O(H), where H is the height of the tree.
	private static void iterativePreorder(Node root) {
		if(root == null) return ;
		Stack<Node> s = new Stack();
		// push null into the stack
		s.push(null);
		// Start from root node set curr node to root node
		Node curr = root;
		// Run till stack is not empty or 
	    // current is not NULL
		while(curr!=null) {
			// Print left children while exist 
	        // and push right child into the stack. 
			System.out.print(curr.data+" ");
			if(curr.right!=null)
				s.push(curr.right);
			// if left exist, else take out a right child from stack 
			if(curr.left !=null)
				curr = curr.left;
			else
				curr = s.pop();
		}
	}	
	
	/* Time for Below DFS Binary Tree Recursive Travesal is O(n) || theta(n)
	 * Auxiliary Space : O(height of tree) || theta(height of tree)
	 */

	// Root - Left - Right
	private static void printPreorder(Node root) {
		if(root==null)
			return ;
		System.out.print(root.data +" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	// Left - Root - Right
	private static void printInorder(Node root) {
		if(root==null)
			return ;
		printInorder(root.left);
		System.out.print(root.data +" ");
		printInorder(root.right);
	}
	// Left - Right - Root
	private static void printPostorder(Node root) {
		if(root==null)
			return ;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data +" ");
	}
}
/*
 * 	private static void iterativePreorder(Node root) {
		if(root == null) return ;
		Stack<Node> s = new Stack();
		// Start from root node (set curr 
	    // node to root node)
		Node curr = root;
		// Run till stack is not empty or 
	    // current is not NULL
		while(curr!=null || s.isEmpty()==false) {
			// Print left children while exist 
	        // and keep pushing right into the  
	        // stack. 
			while(curr!=null) {
				System.out.print(curr.data+" ");
				if(curr.right!=null)
					s.push(curr.right);
				curr = curr.left;
			}
			// We reach when curr is NULL, so We 
	        // take out a right child from stack 
			if(s.isEmpty()==false)
				curr = s.pop();
		}
	}	
	
	*/
