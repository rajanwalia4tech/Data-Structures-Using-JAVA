package circularlinkedlist;

public class CircularLinkedList {
// Efficient : add node after head and swap the head and node data  
// time: O(1)
	public static Node insertAtEnd(Node head,int item) {
		Node temp = new Node(item);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			temp.next = head.next; // insert temp after new head
			head.next = temp;
			//swap the data of first two nodes
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return temp;  // temp is now new head
		}
	}
	
// Naive approach
// Time : O(n)
/*
 * 	public static Node insertAtEnd(Node head,int item) {
		Node temp = new Node(item);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			Node curr = head;
			while(curr.next!=head)
				curr = curr.next;
			curr.next = temp;
			temp.next = head;
			return head;
		}
	}
*/
	
// Efficient Solution : add node after head and swap the head and node data  
// time :  O(1)
	public static Node insertAtBeg(Node head,int item) {
		Node temp = new Node(item);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			temp.next = head.next; // insert temp after new head
			head.next = temp;
			//swap the data of first two nodes
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return head;  // head is now new head
		}
	}
	
// Naive Solution
//	Time  :  O(n)
/*	public static Node insertAtBeg(Node head,int item) {
		Node temp = new Node(item);
		if(head == null) {
			temp.next = temp;
		}else {
			Node curr = head;
			while(curr.next!=head)
				curr = curr.next;
			curr.next = temp;
			temp.next = head;
		}
		return temp;
	}*/
	
	
	// Traveral using do while loop
	public static void printList(Node head) {
		if(head == null)
			return ;
		Node curr = head;
		do {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}while(curr!=head);
	}	
	
	
	/* using for loop	
	public static void printList(Node head) {
		if(head == null)
			return ;
		System.out.print(head.data+" ");
		for(Node curr=head.next;curr!=head;curr= curr.next)
			System.out.print(curr.data+" ");
	}
	*/
	public static Node deleteHead(Node head) {
		if(head == null)return null;
		if(head.next == head) return null;
		Node curr = head;
		head.data = head.next.data;
		head.next = head.next.next; // point next of last to the second node
		return head ; // return node after head
	}
	
	// Naive solution
	// time :  O(n)
	/*
	 * public static Node deleteHead(Node head) {
	 
		if(head == null)return null;
		if(head.next == head) return null;
		Node curr = head;
		while(curr.next!=head)
			curr = curr.next;
		curr.next = head.next; // point next of last to the second node
		return head.next ; // return node after head
	}
	*/

	public static Node DeleteKthNodeFromHead(Node head,int k) {
		if(head == null) return null;
		if(k==1) return null;
		Node temp = head;
		for(int i=0;i<k-2;i++)
			temp = temp.next;
		temp.next = temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		Node head = null;
		head = insertAtBeg(head,10);
		head = insertAtBeg(head,20);
		head = insertAtBeg(head,30);
		head = insertAtBeg(head,40);
		head = insertAtEnd(head,50);
		head = insertAtEnd(head,60);
		head = deleteHead(head);
		printList(head);
		DeleteKthNodeFromHead(head, 4);
		System.out.println();
		printList(head);
		
	}

}
