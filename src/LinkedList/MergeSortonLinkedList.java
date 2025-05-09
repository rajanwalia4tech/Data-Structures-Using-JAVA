	package LinkedList;

public class MergeSortonLinkedList {


	static Node merge(Node a,Node b) {
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
	private static Node findMid(Node head) {
		if(head==null) return head;
		Node slow = head;
		Node fast = head.next;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	
	private static Node mergeSort(Node head) {
		if(head == null || head.next == null) return head;
		Node mid = findMid(head);
		//Node list1 = head;
		Node list2 = mid.next;
		mid.next = null;
		Node headA = mergeSort(head);
		Node headB = mergeSort(list2);
		return merge(headA, headB);
	}
	


	public static void main(String[] args) {
		Node head = new Node(5);
		head = insertEnd(head, 23);
		head = insertEnd(head, 69);
		head = insertEnd(head, 89);
		head = insertEnd(head, 8);
		head = insertEnd(head, 23);
		head = insertEnd(head, 63);
		head = insertEnd(head, 33);
		head = insertEnd(head, 3);
		head = insertEnd(head, 45);
		printList(head);
		head = mergeSort(head);
		printList(head);
	}

	static void printList(Node head) {
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
