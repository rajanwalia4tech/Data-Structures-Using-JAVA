package heaps;

import java.util.ArrayList;


//Implement Priority Queue using min heap
public class Priority_Queue {
	
	private ArrayList<Integer> heap;
	

	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	boolean isEmpty() {
		return heap.size()==0;
	}
	
	int size() {
		return heap.size();
	}
	
	int getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}
	
	void insert(int item) {
		heap.add(item);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex-1)/2;
		while(childIndex>0) {
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1)/2;
			}else {
				return ;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		
		while(leftChildIndex<heap.size()) {
			
			if(heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex<heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if(minIndex == index) {
				break;
			}else {
				int temp1 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);
				index = minIndex;
				leftChildIndex = 2*index + 1;
				rightChildIndex = 2*index + 2;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) throws PriorityQueueException {
		Priority_Queue pq = new Priority_Queue();
		int arr[] = {3,6,9,4,0,2,8,5};
		
		// heap sort :- insert and delete in heap
		// time :- O(n * log n)
		// space:- O(n)
		for(int i=0;i<arr.length;i++)
			pq.insert(arr[i]);
		
		while(pq.isEmpty()==false) {
			System.out.print(pq.removeMin()+" ");
		}

	}

}
