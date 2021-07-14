package binarytree;

public class BST {

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(50);
		root.right = new Node(150);
		insert(root,125);
		insert(root,200);
		insert(root,25);
		insert(root,75);
		printPreorder(root);
		System.out.println();
		delete(root,150);
		
		printPreorder(root);

	}
	private static void printPreorder(Node root) {
		if(root==null)
			return ;
		System.out.print(root.data +" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	// Time :- O(h)
	// Aux 	:- O(h)
	public static Node delete(Node root, int key) {
		if(root == null)	// Empty tree
			return null;
		else if(key < root.data) {		// check in left subtree
			root.left = delete(root.left,key);
		}
		else if(root.data < key) {		// check in right subtree
			root.right = delete(root.right,key);
		}
		else {	
			// No child
			if(root.left==null && root.right == null) return null;
			if(root.left == null) return root.right;	// 1 child
			if(root.right == null) return root.left;	// 1 child
			else {	// Two Child 
				// Assign the successor to the current root
				Node successor = getSuccessor(root);
				root.data = successor.data;
				// delete the successor node
				root.right = delete(root.right,successor.data);
			}
		}
		return root;
	}	
	
	// Time :- O(h)
	//Find the Maximum element corrosponding
	//to the root in its subtree in BST
	public static Node getSuccessor(Node root){	 
		Node curr =  root.right;
		while(curr!=null && curr.left!=null) {
			curr =curr.left;
		}
		return curr;
	}
	
	// Time :- O(h) , h =  height of tree
	// Aux Space  = O(1)
	public static Node iterativeInsert(Node root,int key) {
		if(root==null)
			return new Node(key);
		Node curr = root;
		while(curr!=null) {
			if(key<curr.data) { 	// insert in left subtree
				if(curr.left == null) {
					curr.left = new Node(key);
					break;
				}
				curr = curr.left;
			}
			else if(curr.data<key) {	// insert in right subtree
				if(curr.right == null) {
					curr.right = new Node(key);
					break;
				}
				curr = curr.right; 
			}
			else	//Not insert duplicate 
				return root;
		}
		return root;
	}
	
	// Time -  O(h),h = height of tree
	// Aux space = O(h)
	public static Node insert(Node root,int key) {
		if(root == null)
			return new Node(key);
		if(key<root.data) {
			root.left = insert(root.left,key);
		}
		else {
			root.right = insert(root.right,key);
		}
		return root;
	}
	
	//Time :- O(h) , h = height of tree
	// Aux space :- O(1)
	public static boolean iterativeSearch(Node root,int key) {
		while(root!=null) {
			if(root.data == key)
					return true;
			else if(root.data>key)
				root = root.left;
			else	//key < root.data
				root = root.right;
		}
		return false;
	}
	
	// Time -  O(h),h = height of tree
	// Aux space = O(h)
	public static boolean search(Node root,int key) {
		if(root == null)
			return false;
		else if(root.data == key)
				return true;
		else if(root.data>key)
			return search(root.left,key);
		else	//key < root.data
			return search(root.right,key);
	}

}
