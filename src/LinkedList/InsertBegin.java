package LinkedList;

public class InsertBegin {

	static Node insertBegin(Node head, int item)
	{
		Node temp =new Node(item);
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = insertBegin(head,10);
		head = insertBegin(head,20);
		head = insertBegin(head,30);
		head.iterativePrintList(head);
	}
}
