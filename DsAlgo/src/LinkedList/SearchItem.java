package LinkedList;

public class SearchItem {
	
	static int searchItem(int item,Node head) {
		int pos=1;
		while(head!=null) {
			if(head.data==item)
				return pos;
			pos++;
			head = head.next;
		}
		return -1;
	}
	static int recursiveSearchItem(int item,Node head) {
		
		if(head ==null)
			return -1;
		else if(head.data == item)
			return 1;		
		
		 int pos = recursiveSearchItem(item,head.next);
		 if(pos == -1)
			 return pos;
		 else 
			 return pos+1;			
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		System.out.println(searchItem(20,head));
		System.out.println(searchItem(20,head));
	}

}
