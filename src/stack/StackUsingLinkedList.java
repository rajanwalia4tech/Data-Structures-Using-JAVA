package stack;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}
public class StackUsingLinkedList<T> {
	private Node<T> head;
	private int size;
	public StackUsingLinkedList() {
		head = null;
		size=0;
	}

	int size() {
		return size;
	}
	
	T peek() throws StackEmptyException {
		if(size()==0)
			throw new StackEmptyException();
		return head.data;
	}
	
	boolean isEmpty() {
		return head==null; //or  size()==0
	}
	void push(T item) {
		Node<T> temp = new Node(item);
		temp.next = head;
		head = temp;
		size++;
	}
	
	T pop() throws StackEmptyException {
		if(head==null)
			throw new StackEmptyException();
		T tempData = head.data;
		head = head.next;
		size--;
		return tempData;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
		for(int i=1;i<=stack.size();i++)
			System.out.println(stack.pop());
	}
}
