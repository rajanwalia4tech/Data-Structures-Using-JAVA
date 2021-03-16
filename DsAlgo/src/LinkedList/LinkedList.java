package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	
	void iterativePrintList(Node head) {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp);
	}
	
	void recursivePrintList(Node head) {
		if(head==null)
		{
			System.out.println(head);
			return;
		}
		System.out.print(head.data+"->");
		recursivePrintList(head.next);
	}
	
}

public class LinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.iterativePrintList(head);
		System.out.println();
		head.recursivePrintList(head);		
	}

}
