package LinkedList;

class Test {

	// Function to merge sort
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
	
	// Function to merge two linked lists
	static Node merge(Node head1, Node head2)
	{
		Node merged = new Node(-1);
		Node temp = merged;
	
		// While head1 is not null and head2
		// is not null
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				temp.next = head1;
				head1 = head1.next;
			}
			else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
	
		// While head1 is not null
		while (head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
	
		// While head2 is not null
		while (head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		return merged.next;
	}

	// Find mid using The Tortoise and The Hare approach
	static Node findMid(Node head)
	{
		Node slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	// Function to print list
	static void printList(Node head)
	{
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Node head = new Node(7);
		Node temp = head;
		temp.next = new Node(10);
		temp = temp.next;
		temp.next = new Node(5);
		temp = temp.next;
		temp.next = new Node(20);
		temp = temp.next;
		temp.next = new Node(3);
		temp = temp.next;
		temp.next = new Node(2);
		temp = temp.next;

		// Apply merge Sort
		head = mergeSort(head);
		System.out.print("\nSorted Linked List is: \n");
		printList(head);
	}
}
