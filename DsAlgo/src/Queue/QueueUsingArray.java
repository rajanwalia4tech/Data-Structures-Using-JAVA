package Queue;

public class QueueUsingArray {
	private int data[];
	private int front; // index of front element
	private int rear;	// index of rear element
	private int size;
	
	public QueueUsingArray() {
		data  = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int capacity) {
		data  = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	int front() throws QueueEmptyException {
		if(size ==0)
		{
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	void enqueue(int item) throws QueueFullException {
		if(size == data.length)
			throw new QueueFullException();
		if(size == 0) //when queue is empty
			front = 0;
		rear++;
		size++;
		// rear = (rear+1) % data.length();
		if(rear == data.length)
			rear = 0; 
		data[rear] = item;
	}
	
	int dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		int item = data[front];
		//front = (front+1) % data.length();
		front++;
		if(front == data.length)
				front = 0;
		size--;
		if(size==0){
			front =-1;
			rear = -1;
		}
		return item;
	}
	
	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(3);
		for(int i=1;i<=10;i++)
			try {
				queue.enqueue(i);
			}catch (QueueFullException e) {
		}

		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}		
	}
}
