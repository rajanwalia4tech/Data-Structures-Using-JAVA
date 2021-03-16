package LinkedList;

public class InsertionInSortedLinkedList {

	static Node sortedInsert(Node head,int item){
		Node temp = new Node(item);
		if(head == null)
			return temp;
		if(item<head.data)
		{
			temp.next = head;
			return temp;	
		}
		Node current = head;
		while(current.next!=null && item>current.next.data)
		{
				current = current.next;
		}
		temp.next = current.next;
		current.next=temp;
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
		Node head =null;
		head = sortedInsert(head, 10);
		head = sortedInsert(head, 20);
		head = sortedInsert(head, 30);
		head = sortedInsert(head, 20);
		iterativePrintList(head);
	}

}
