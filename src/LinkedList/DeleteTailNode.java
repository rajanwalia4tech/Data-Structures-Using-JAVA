package LinkedList;

public class DeleteTailNode {
	
	static Node deleteTail(Node head){
		if(head == null)
			return head;
		if(head.next == null)
			return null;
		Node current = head; 
		while(current.next.next !=null)
		{
			current = current.next;
		}
		current.next = null;
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
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head=deleteTail(head);
		iterativePrintList(head);
	}

}
