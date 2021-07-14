package heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MinPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return -1;
		else if(o2 > o1)
			return 1;
		else
			return 0;
	}
	
}

class MaxPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return -1;
		else if(o2 < o1)
			return 1;
		else
			return 0;
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length() > o2.length())
			return 1;
		return 0;
	}
}

public class PriorityQueueJava {

/*  Sort the String according to their length
 * 
	public static void main(String[] args) {
		String arr[] = {"this","is","your","house","to","play"};
		StringLengthComparator stringComparator = new StringLengthComparator();
		PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
		
		// Below code sort Array in decreasing order
		// it implement max heap
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}

	}

*/
	

	public static void main(String[] args) {
//		MinPQComparator minComparator = new MinPQComparator();
		MaxPQComparator maxComparator = new MaxPQComparator();
		PriorityQueue<Integer> pq = new PriorityQueue<>(maxComparator);
		
		// Below code sort Array in decreasing order
		// it implement max heap
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int arr[] = {9,3,8,2,5,0,1};
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}

	}
	
	 
/* By default, java implement min heap
 * 
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int arr[] = {9,3,2,5,0,1};
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}

	}
*/
}
