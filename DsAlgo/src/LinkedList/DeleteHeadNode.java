package LinkedList;

public class DeleteHeadNode {
	
	static Node deleteHead(Node head){
		if(head == null)
			return head;
		head = head.next;
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
		head=deleteHead(head);
		iterativePrintList(head);
	}

}
