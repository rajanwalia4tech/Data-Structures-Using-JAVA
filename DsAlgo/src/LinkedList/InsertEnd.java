package LinkedList;

public class InsertEnd {

	static Node insertEnd(Node head,int item) {
		Node temp = new Node(item);
		if(head == null)
			return temp;
		
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = temp;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = insertEnd(head,10);
		head = insertEnd(head,20);
		head = insertEnd(head,30);
		head = insertEnd(head,40);
		head.iterativePrintList(head);
	}

}
