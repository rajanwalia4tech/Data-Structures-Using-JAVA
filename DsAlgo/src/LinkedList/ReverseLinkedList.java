package LinkedList;

public class ReverseLinkedList {

	static Node insertBegin(Node head, int item)
	{
		Node temp =new Node(item);
		temp.next = head;
		head = temp;
		return head;
	}
	static void iterativePrintList(Node head) {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp);
	}
	
	static Node reverse(Node head) {
		if(head == null)
			return head;
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = insertBegin(head,60);
		head = insertBegin(head,50);
		head = insertBegin(head,40);
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		iterativePrintList(head);
		System.out.println();
		head = reverse(head);
		iterativePrintList(head);
		
	}

}
