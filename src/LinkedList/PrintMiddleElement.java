package LinkedList;

public class PrintMiddleElement {

	static Node insertBegin(Node head, int item)
	{
		Node temp =new Node(item);
		temp.next = head;
		head = temp;
		return head;
	}
	
	static void printMiddle(Node head) {
		if(head==null)
			return ;
		Node slow = head;
		//Node fast = head; // find the right mid in even no. of nodes
		Node fast = head.next; // find the left mid in even no. of nodes
		//Move the fast point by 2 position ahead and 
	   // Move the slow pointer by 1 position ahead
		while( fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = insertBegin(head,70);
		head = insertBegin(head,60);
		head = insertBegin(head,50);
		head = insertBegin(head,40);
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		printMiddle(head);
	}

}
