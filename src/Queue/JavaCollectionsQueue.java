package Queue;

import java.util.*;

public class JavaCollectionsQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList(); //Queue is an Interface 
		queue.add(10); // add item into the queue
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.clear(); //clear the queue
		
		System.out.println(queue.size()); //return size of queue
		System.out.println(queue.peek()); //return front element of queue
		
		while(queue.isEmpty()!=true)
			System.out.println(queue.poll()); //remove front element from queue
	}

}
