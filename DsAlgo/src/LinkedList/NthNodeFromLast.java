package LinkedList;

public class NthNodeFromLast {

	static Node insertBegin(Node head, int item)
	{
		Node temp =new Node(item);
		temp.next = head;
		head = temp;
		return head;
	}
	
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    static int getNthFromLast(Node head, int n)
    {
        if(head == null) return -1;
        
    	Node first = head;
    	//Move the first pointer n position ahead
    	for(int i=1;i<=n;i++)
    	{
    	    if(first == null)
    	        return -1;
    	    first = first.next;
    	}
    	Node second = head;
    	//Now move first and second with same speed till first!=null
    	while(first!=null)
    	{
    	    first = first.next;
    	    second = second.next;
    	}
    	return second.data;
    }
	
	public static void main(String[] args) {
		Node head = null;
		head = insertBegin(head,60);
		head = insertBegin(head,50);
		head = insertBegin(head,40);
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
		System.out.println(getNthFromLast(head,4));
	}

}
