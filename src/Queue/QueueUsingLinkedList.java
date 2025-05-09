package Queue;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		this.next = null;
	}
}

public class QueueUsingLinkedList<T>{
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	QueueUsingLinkedList(){
		front = null;
		rear = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	T front() throws QueueEmptyException {
		if(size == 0)
			throw  new QueueEmptyException();
		return front.data;
	}

	void enqueue(T item) {
		Node<T> newNode = new Node(item);
		if(rear == null) {
			front = rear = newNode;
		}else {
		rear.next = newNode;
		rear = newNode;
		}
		size++;
	}
	
	T dequeue() throws QueueEmptyException  {
		if(size == 0)
			throw  new QueueEmptyException();
		T item =  front.data;
		front = front.next;
		if(size==1) //for last element
			rear = null;
		size--;
		return item;
	}
	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		for(int i=1;i<=10;i++)
			queue.enqueue(i);

		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}		

	}

}
