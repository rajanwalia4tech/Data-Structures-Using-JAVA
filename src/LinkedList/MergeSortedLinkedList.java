package LinkedList;

public class MergeSortedLinkedList {

	static Node mergeSortedList(Node a,Node b) {
		if(a==null) return b;
		if(b==null) return a;
		Node head,tail;
		if(a.data<=b.data) {
			head = tail = a;
			a = a.next;
		}else {
			head = tail =b;
			b = b.next;
		}
		
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next = a;
				tail = a;
				a = a.next;
			}
			else {
				tail.next = b;
				tail = b;
				b = b.next;
			}
		}
		if(a!=null) {
			tail.next = a;
		}else {
			tail.next = b;
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node headA = new Node(5);
		headA = insertEnd(headA, 15);
		headA = insertEnd(headA, 30);
		iterativePrintList(headA);
		Node headB = new Node(10);
		headB = insertEnd(headB, 25);
		headB = insertEnd(headB, 50);
		iterativePrintList(headB);
		Node head = mergeSortedList(headA, headB);
		iterativePrintList(head);
		
	}
	static void iterativePrintList(Node head) {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp);
		
	}
	
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
}
