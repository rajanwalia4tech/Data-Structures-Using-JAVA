package LinkedList;

public class InsertAtPosition {

	static Node insertAtPosition(Node head,int pos,int item) {
		Node temp = new Node(item);
		if(pos==1) {
			temp.next = head;
			
			return temp;
		}
		Node current = head;	
		
		for(int count=1;count<=pos-2 && current!=null;count++ )
		current = current.next;
		
		if(current == null) //List is fully traverse and position exceed
			return head;
			
		temp.next = current.next;
		current.next = temp;
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
		Node head=null;
		head=insertAtPosition(head,1,50);
		head=insertAtPosition(head,2,40);
		head=insertAtPosition(head,2,20);
		
		iterativePrintList(head);
	}

}
