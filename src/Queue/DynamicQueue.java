package Queue;

public class DynamicQueue {
	private int data[];
	private int front; // index of front element
	private int rear;	// index of rear element
	private int size;
	
	public DynamicQueue() {
		data  = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public DynamicQueue(int capacity) {
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
		if(size == data.length) {
			doubleCapacity();
		}
		if(size == 0) //when queue is empty
			front = 0;
		rear++;
		size++;
		// rear = (rear+1) % data.length();
		if(rear == data.length)
			rear = 0; 
		data[rear] = item;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length]; // Double the size 
		int index = 0;
		for(int i=front;i<temp.length;i++) { // copy elements after front if any
			data[index] = temp[i];
			index++;
		}
		for(int i=0;i<=front-1;i++) { //  copy elements before front if any
			data[index] = temp[i];
			index++;
		}
		front=0; //new front index
		rear = temp.length-1; // new rear index
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
		DynamicQueue queue = new DynamicQueue(5);
		for(int i=1;i<=8;i++)
			try {
				queue.enqueue(i);
			}catch (QueueFullException e) {
		}
		
		System.out.println(queue.size());
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}		
	}
}
