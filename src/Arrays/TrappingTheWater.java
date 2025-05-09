package Arrays;

public class TrappingTheWater {

	public static void main(String[] args) {
		int a[] = {2,9,7,5,3,0,2,5};
		naiveSolution(a);
		efficientSolution(a);
	}

	
/*
 * Time O(n) ,Space O(n)
Method 2: This is an efficient solution to the above problem.

Approach: In the previous solution, to find the highest bar on the left and right,
	 array traversal is needed which reduces the efficiency of the solution. 
	 To make this efficient one must pre-compute the highest bar on the left and
	 right of every bar in linear time. Then use these pre-computed values to find
	 the amount of water in every array element.
	 
Algorithm: 
	1. Create two array left and right of size n. create a variable max_ = INT_MIN.
	2. Run one loop from start to end. In each iteration update 
		max_ as max_ = max(max_, arr[i]) and also assign left[i] = max_
	3. Update max_ = INT_MIN.
	4. Run another loop from end to start. In each iteration update
	 	max_ as max_ = max(max_, arr[i]) and also assign right[i] = max_
	5. Traverse the array from start to end.
	6.The amount of water that will be stored in this column is 
		min(a,b) – array[i],(where a = left[i] and b = right[i]) add this value
	 	to total amount of water stored
	7. Print the total amount of water stored.
		 
	 */
	
	private static void efficientSolution(int[] a) {
		int res=0;
		int n = a.length;
		int lMax[] = new int[n];
		int rMax[] = new int[n];
		
		lMax[0] = a[0];
		// Find maximum element on its left
		for(int i=1;i<n;i++)
			lMax[i] = Math.max(a[i],lMax[i-1]);
		
		
		rMax[n-1] = a[n-1];
		// Find maximum element on its right
		for(int i=n-2;i>=0;i--)
			rMax[i] = Math.max(a[i],rMax[i+1]);
		
		for(int i=1;i<n-1;i++) {
			res+= (Math.min(lMax[i],rMax[i]) - a[i]);
		}
		System.out.println(res);
		
	}

	
	
/* Time: O(n^2) , space: O(1)
	  Method 1 : This is a simple solution to the above problem.
	
	Approach: The idea is to traverse every array element and find the highest bars 
		on left and right sides. Take the smaller of two heights. The difference between
		the smaller height and height of the current element is the amount of water that
		can be stored in this array element.
	Algorithm: 
		1. Traverse the array from start to end.
		2. For every element, traverse the array from start to that index and find the 
		maximum height (a) and traverse the array from the current index to end and 
		find the maximum height (b).
		3. The amount of water that will be stored in this column is min(a,b) – array[i],
		add this value to total amount of water stored
		4. Print the total amount of water stored.
*/
	private static void naiveSolution(int[] a) {
		int res = 0;
		int n = a.length;
		// Water can't be collect on 0th and last bar
		// so 1 to n-1th bars are taken
		for(int i=1;i<n-1;i++) {
			int lMaxBar = a[i];
			// Find left Most highest Bar comparing with ith bar
			for(int j=0;j<i;j++)
				lMaxBar = Math.max(lMaxBar,a[j]);
			
			int rMaxBar = a[i];
			// Find right Most highest Bar comparing with ith bar
			for(int j=i+1;j<n;j++)
				rMaxBar = Math.max(rMaxBar,a[j]);
				
			res += (Math.min(lMaxBar, rMaxBar) - a[i]);			
		}
		System.out.println(res);
	}
}
