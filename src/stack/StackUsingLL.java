package stack;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	StackUsingLL(){
		head = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	// return top element of stack
	public T peek() throws StackEmptyException {
		if(size() == 0)
		{
			//StackEmptyException
			StackEmptyException  e= new StackEmptyException();
			throw e;
		}	
		return head.data;
	}
	
	boolean isEmpty() {
		return size()==0;  //head==null
	}
	
	public void push(T item) {
		Node<T> temp = new Node<>(item); 
		temp.next = head;
		head = temp;
		size++;
	}
	
	public T pop() throws StackEmptyException {
		if(size() == 0)
		{
			//StackEmptyException
			StackEmptyException  e= new StackEmptyException();
			throw e;
		}	
		T item= head.data;
		head = head.next;
		size--;
		return item;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> s =new StackUsingLL<Integer>();
		s.push(13);
		s.push(15);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
