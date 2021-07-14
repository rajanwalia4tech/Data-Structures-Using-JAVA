package slidingwindow;

/*
 
  Given an array of integers and a number k, find maximum
  sum of a subarray of size k
  
 Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4 
Output : 39
 */


public class MaximumSumSubArray {

	public static void main(String[] args) {
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		System.out.println(maximumSum(arr,k));
	}

	private static int maximumSum(int[] arr, int k) {
		
		// k must be greater
        if (arr.length< k)
        {
           System.out.println("Invalid");
           return -1;
        }
		
		int end = 0;
		int start = 0;
		int sum=0;
		
		// Compute sum of first window of size k
		for(end=0;end<k;end++)
			sum+=arr[end];
		
        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of 
        // current window.
		int max = sum;
		while(end<arr.length) {
			sum =sum-arr[start++] + arr[end++];
			if(sum>max)
				max = sum;
		}
		return max;
	}

}
